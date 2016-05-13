/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.sportnet.service;

import com.senac.spornet.entity.Categoria;
import com.senac.spornet.entity.Produto;
import java.util.List;

/**
 *
 * @author nliggia-ibm
 */
public interface ProdutoService {

    public List<Produto> listar(int offset, int quantidade);

    public List<Produto> listarPorCategoria(Categoria categoria, int offset, int quantidade);

    public Produto obter(long idProduto);

    public void incluir(Produto p);

    public void alterar(Produto p);

    public void remover(long idProduto);

}
