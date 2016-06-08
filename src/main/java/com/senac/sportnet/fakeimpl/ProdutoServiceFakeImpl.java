/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.sportnet.fakeimpl;

import com.senac.spornet.entity.Categoria;
import com.senac.spornet.entity.ImagemProduto;
import com.senac.spornet.entity.Produto;
import com.senac.sportnet.service.CategoriaService;
import com.senac.sportnet.service.ProdutoService;
import com.senac.sportnet.web.entity.ProdutoQuantidade;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author nliggia-ibm
 */
public class ProdutoServiceFakeImpl implements ProdutoService {

  private static final Map<Long, Produto> MAPA_PRODUTOS = new LinkedHashMap<Long, Produto>();

  private static final String DESCRICAO_PADRAO = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. "
          + "Aenean vel ipsum vehicula, venenatis leo nec, ornare felis. Ut consectetur est vel pulvinar tempus. "
          + "Suspendisse commodo cursus turpis. Etiam ac enim egestas, sollicitudin libero ac, eleifend risus. "
          + "Phasellus nec posuere magna, in vehicula elit. "
          + "Etiam rhoncus, ipsum eget dapibus vulputate, massa nisi feugiat odio, a consectetur urna diam id risus. "
          + "Morbi sed pharetra nisl, nec aliquam ex. Morbi congue urna ut semper aliquam. "
          + "Sed aliquet turpis ac sem egestas dignissim. Praesent interdum dapibus cursus. "
          + "Cras posuere tempor lectus, ac porttitor tellus maximus vel.";

  static {
    CategoriaService categorias = new CategoriaServiceFakeImpl();
    Produto produto = new Produto(1L, "Floresta negra",
            DESCRICAO_PADRAO,
            5, new Date(),
            Arrays.asList(new ImagemProduto(1L, "Bla bla bla", "imagem01a.jpg"), new ImagemProduto(2L, "Xpto Xpto", "imagem01b.jpg"), new ImagemProduto(3L, "Chola mais", "imagem01c.jpg")),
            Arrays.asList(categorias.obter(1), categorias.obter(3)));
    MAPA_PRODUTOS.put(produto.getId(), produto);
    produto = new Produto(2L, "Torta de morango",
            DESCRICAO_PADRAO,
            6, new Date(),
            Arrays.asList(new ImagemProduto(4L, "Bla bla bla", "imagem02a.jpg"), new ImagemProduto(5L, "Xpto Xpto", "imagem02b.jpg")),
            Arrays.asList(categorias.obter(1), categorias.obter(3)));
    MAPA_PRODUTOS.put(produto.getId(), produto);
    produto = new Produto(3L, "Sonho de valsa",
            DESCRICAO_PADRAO,
            4, new Date(),
            Arrays.asList(new ImagemProduto(6L, "Bla bla bla", "imagem03a.jpg")),
            Arrays.asList(categorias.obter(1), categorias.obter(3), categorias.obter(6)));
    MAPA_PRODUTOS.put(produto.getId(), produto);
    produto = new Produto(4L, "Morango com leite condensado",
            DESCRICAO_PADRAO,
            2, new Date(),
            Arrays.asList(new ImagemProduto(7L, "Bla bla bla", "imagem04a.jpg"), new ImagemProduto(8L, "Xpto Xpto", "imagem04b.jpg")),
            Arrays.asList(categorias.obter(1), categorias.obter(4)));
    MAPA_PRODUTOS.put(produto.getId(), produto);
    produto = new Produto(5L, "Abacaxi com coco",
            DESCRICAO_PADRAO,
            4, new Date(),
            Arrays.asList(new ImagemProduto(9L, "Bla bla bla", "imagem04a.jpg"), new ImagemProduto(10L, "Xpto Xpto", "imagem04b.jpg")),
            Arrays.asList(categorias.obter(1), categorias.obter(5), categorias.obter(7), categorias.obter(8)));
    MAPA_PRODUTOS.put(produto.getId(), produto);
  }

  @Override
  public List<Produto> listar(int offset, int quantidade) {
    return new ArrayList<Produto>(MAPA_PRODUTOS.values());
  }

  @Override
  public List<Produto> listarPorCategoria(Categoria categoria, int offset, int quantidade) {
    List<Produto> lista = new ArrayList<Produto>();
    for (Map.Entry<Long, Produto> entry : MAPA_PRODUTOS.entrySet()) {
      Produto p = entry.getValue();
      if (p.getCategorias().contains(categoria)) {
        lista.add(p);
      }
    }
    return lista;
  }

  @Override
  public Produto obter(long idProduto) {
    return MAPA_PRODUTOS.get(idProduto);
  }

  @Override
  public void incluir(Produto p) {
    // new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public void alterar(Produto p) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public void remover(long idProduto) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

    @Override
    public void finalizarCompra(Set<ProdutoQuantidade> produto, float total, Long idUser) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Produto> listarPorMarca(int offset, int quantidade, String marca) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}