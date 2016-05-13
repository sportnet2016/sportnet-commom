/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.sportnet.fakeimpl;

import com.senac.spornet.entity.Categoria;
import com.senac.sportnet.service.CategoriaService;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author nliggia-ibm
 */


public class CategoriaServiceFakeImpl implements CategoriaService {

  private static final Map<Integer, Categoria> MAP_CATEGORIA = new LinkedHashMap<Integer, Categoria>();

  static {
    MAP_CATEGORIA.put(1, new Categoria(1, "Bolo"));
    MAP_CATEGORIA.put(2, new Categoria(2, "Torta"));
    MAP_CATEGORIA.put(3, new Categoria(3, "Chocolate"));
    MAP_CATEGORIA.put(4, new Categoria(4, "Morango"));
    MAP_CATEGORIA.put(5, new Categoria(5, "Light"));
    MAP_CATEGORIA.put(6, new Categoria(6, "Crocante"));
    MAP_CATEGORIA.put(7, new Categoria(7, "Abacaxi"));
    MAP_CATEGORIA.put(8, new Categoria(8, "Coco"));
  }

  @Override
  public List<Categoria> listar() {
    return new ArrayList<Categoria>(MAP_CATEGORIA.values());
  }

  @Override
  public Categoria obter(int id) {
    return MAP_CATEGORIA.get(id);
  }
}

