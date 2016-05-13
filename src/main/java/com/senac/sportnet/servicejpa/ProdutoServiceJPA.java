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
import com.senac.spornet.entity.Produto;
import com.senac.sportnet.service.ProdutoService;
import java.util.List;
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
    public Produto obter(long idProduto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

}
