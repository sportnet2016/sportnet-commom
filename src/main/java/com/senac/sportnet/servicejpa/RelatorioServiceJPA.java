/*
 * The MIT License
 *
 * Copyright 2016 Eder Rodrigues.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.senac.sportnet.servicejpa;

import com.senac.spornet.entity.Produto;
import com.senac.spornet.entity.Venda;
import com.senac.sportnet.service.RelatorioService;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Eder Rodrigues
 */
public class RelatorioServiceJPA implements RelatorioService {

    private EntityManagerFactory emFactory
            = Persistence.createEntityManagerFactory("persistence");

    @Override
    public Venda mostrar(Long id) {
        EntityManager em = emFactory.createEntityManager();

        try {
            Query query = em.createNamedQuery("Venda.relatorio");
            query.setParameter("id", id);
            Venda result = (Venda) query.getSingleResult();

            return result;
        } catch (NoResultException e) {
            return null;
        } finally {
            em.close();
        }
    }

    @Override
    public List<Venda> mostrarTodos() {
        EntityManager em = emFactory.createEntityManager();
        try {
            Query query = em.createNamedQuery("Venda.relatorioAll");
            List<Venda> v = query.getResultList();
            return v;

        } finally {
            em.close();
        }
    }

    @Override
    public List<Produto> searchProducts(String name) {
        name = name.substring(0,1).toUpperCase().concat(name.substring(1));
        EntityManager em = emFactory.createEntityManager();
        try {
            Query query = em.createNamedQuery("Produto.likeSearchProduct").setFirstResult(0).setMaxResults(50);
            query.setParameter(1, '%'+name+'%');
            List<Produto> products = query.getResultList();
            return products;

        } finally {
            em.close();
        }
    }

}
