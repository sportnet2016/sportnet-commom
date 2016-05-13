/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.sportnet.servicejpa;


import com.senac.spornet.entity.Categoria;
import com.senac.sportnet.service.CategoriaService;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author nliggia-ibm
 */
public class CategoriaServiceJPA implements CategoriaService {

    private EntityManagerFactory emFactory
            = Persistence.createEntityManagerFactory("LojinhaPU");

    @Override
    public List<Categoria> listar() {
        EntityManager em = emFactory.createEntityManager();
        try {
            Query query = em.createQuery("SELECT c FROM Categoria c");
            List<Categoria> resultados = query.getResultList();
            return resultados;
        } finally {
            em.close();
        }
    }

    @Override
    public Categoria obter(int id) {
        EntityManager em = emFactory.createEntityManager();
        try {
            Query query = em.createQuery("SELECT c FROM Categoria c "
                    + "WHERE c.id = :idCategoria")
                    .setParameter("idCategoria", id);
            Categoria resultado = (Categoria) query.getSingleResult();
            return resultado;
        } finally {
            em.close();
        }
    }

}
