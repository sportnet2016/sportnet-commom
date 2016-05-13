/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.sportnet.service;

import com.senac.spornet.entity.Categoria;
import java.util.List;

/**
 *
 * @author nliggia-ibm
 */
public interface CategoriaService {

    public List<Categoria> listar();

    public Categoria obter(int id);

}
