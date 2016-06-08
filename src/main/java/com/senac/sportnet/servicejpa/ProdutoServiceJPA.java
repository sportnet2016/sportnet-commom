/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.sportnet.servicejpa;

/**
 *
 * @author nliggia-ibm
 */
import com.senac.spornet.entity.Categoria;
import com.senac.spornet.entity.ItensVenda;
import com.senac.spornet.entity.Produto;
import com.senac.spornet.entity.Venda;
import com.senac.sportnet.service.ProdutoService;
import com.senac.sportnet.web.entity.ProdutoQuantidade;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ProdutoServiceJPA implements ProdutoService {

    private EntityManagerFactory emFactory
            = Persistence.createEntityManagerFactory("persistence");

    @Override
    public List<Produto> listar(int offset, int quantidade) {
        EntityManager em = emFactory.createEntityManager();
        try {
            Query query = em.createQuery("SELECT DISTINCT p FROM Produto p "
                    + "LEFT JOIN FETCH p.categorias "
                    + "LEFT JOIN FETCH p.imagens")
                    .setFirstResult(offset)
                    .setMaxResults(quantidade);
            List<Produto> resultados = query.getResultList();
            return resultados;
        } finally {
            em.close();
        }
    }

    @Override
    public List<Produto> listarPorCategoria(Categoria categoria, int offset, int quantidade) {
        EntityManager em = emFactory.createEntityManager();
        try {
            Query query
                    = em.createNamedQuery("Produto.listarPorCategoria")
                    .setParameter("idCategoria", categoria.getId())
                    .setFirstResult(offset)
                    .setMaxResults(quantidade);
            List<Produto> resultados = query.getResultList();
            return resultados;
        } finally {
            em.close();
        }
    }
    
    @Override
    public List<Produto> listarPorMarca(int offset, int quantidade, String marca) {
        EntityManager em = emFactory.createEntityManager();
        try {
            Query query = em.createQuery("SELECT DISTINCT p FROM Produto p "
                    + "LEFT JOIN FETCH p.categorias "
                    + "LEFT JOIN FETCH p.imagens "
                    + "WHERE p.marca = '" + marca + "'")
                    .setFirstResult(offset)
                    .setMaxResults(quantidade);
            List<Produto> resultados = query.getResultList();
            return resultados;
        } finally {
            em.close();
        }
    }

    @Override
    public Produto obter(long idProduto) {
        EntityManager em = emFactory.createEntityManager();

        try {
            Query query = em.createNamedQuery("Produto.obter").setParameter("idProduto", idProduto);
            Produto produto = (Produto) query.getSingleResult();
            
            return produto;
        } finally {
            em.close();
        }
    }

    @Override
    public void incluir(Produto p) {
        EntityManager em = emFactory.createEntityManager();
        EntityTransaction transacao = em.getTransaction();
        try {
            transacao.begin();
            for (Categoria c : p.getCategorias()) {
                if (c.getId() != null) {
                    em.merge(c);
                } else {
                    em.persist(c);
                }
            }
            em.persist(p);
            transacao.commit();
        } catch (Exception e) {
            if (transacao.isActive()) {
                transacao.rollback();
            }
        } finally {
            em.close();
        }
    }

    @Override
    public void alterar(Produto p) {
        EntityManager em = emFactory.createEntityManager();
        EntityTransaction transacao = em.getTransaction();
        try {
            transacao.begin();
            for (Categoria c : p.getCategorias()) {
                if (c.getId() != null) {
                    em.merge(c);
                } else {
                    em.persist(c);
                }
            }
            em.merge(p);
            transacao.commit();
        } catch (Exception e) {
            if (transacao.isActive()) {
                transacao.rollback();
            }
        } finally {
            em.close();
        }
    }

    @Override
    public void remover(long idProduto) {
        EntityManager em = emFactory.createEntityManager();
        EntityTransaction transacao = em.getTransaction();
        try {
            transacao.begin();
            Produto p = em.find(Produto.class, idProduto);
            em.remove(p);

            transacao.commit();
        } catch (Exception e) {
            transacao.rollback();
        } finally {
            em.close();
        }
    }

    @Override
    public void finalizarCompra(Set<ProdutoQuantidade> produto,float total, Long idUser) {
        EntityManager em = emFactory.createEntityManager();
        EntityTransaction transacao = em.getTransaction();
        List<Produto> result = new ArrayList<>();
        List<Venda> resultVendas = new ArrayList<>();
        Set<ProdutoQuantidade> produtosV = produto;
        long ultimaVenda=0;
        try {
            transacao.begin();
            for (Iterator<ProdutoQuantidade> iter = produto.iterator(); iter.hasNext();) {
                ProdutoQuantidade produtosVendidos = iter.next();

//                Query query = em.createQuery("UPDATE Produto p set p.qtdAtual= p.qtdAtual -"
//                        + produtosVendidos.getQuantidade()
//                        + " WHERE p.id = " + produtosVendidos.produto.getId());
                Query query = em.createQuery("Select p from Produto p where p.id= :idProduto");
                query.setParameter("idProduto", produtosVendidos.produto.getId());
                result = query.getResultList();
                for (Produto p : result) {
                    int q = p.getQtdAtual() - produtosVendidos.getQuantidade();
                    p.setQtdAtual(q);
                    total = total + p.getPreco();
                    em.merge(p);
                }
            }
            Venda venda = new Venda();
            venda.setIdCliente(idUser);
            venda.setDtVenda(new Date());
            venda.setVlTotal(total);
            em.persist(venda);
            
            Query qVenda = em.createQuery("Select v from Venda v");
            resultVendas = qVenda.getResultList();
            for (Venda v : resultVendas) {
                ultimaVenda = v.getIdVenda();
            }
            ItensVenda iv = new ItensVenda();
            iv.setIdVenda(ultimaVenda);
            for (Iterator<ProdutoQuantidade> it = produtosV.iterator(); it.hasNext();) {
                ProdutoQuantidade p = it.next();
                iv.setIdProduto(p.produto.getId());
                em.persist(iv);
                em.flush();
                em.clear();
            }
            
            transacao.commit();
        } finally {
            em.close();
        }

    }

}
