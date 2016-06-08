/*
 * The MIT License
 *
 * Copyright 2016 nliggia-ibm.
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

import com.senac.spornet.entity.Usuario;
import com.senac.sportnet.service.ClienteService;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author nliggia-ibm
 */
public class ClienteServiceJPA implements ClienteService {

    private EntityManagerFactory emFactory
            = Persistence.createEntityManagerFactory("persistence");



    @Override
    public Usuario obter(long idCliente) {
        EntityManager em = emFactory.createEntityManager();

        try {
            Query query = em.createNamedQuery("Cliente.obter").setParameter("idCliente", idCliente);
            Usuario cliente = (Usuario) query.getSingleResult();

            return cliente;
        } finally {
            em.close();
        }
    }

    @Override
    public void incluir(Usuario c) {
        EntityManager em = emFactory.createEntityManager();
        EntityTransaction transacao = em.getTransaction();
        try {
            transacao.begin();
            em.persist(c);
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
    public void alterar(Usuario c) {
        EntityManager em = emFactory.createEntityManager();
        EntityTransaction transacao = em.getTransaction();
        try {
            transacao.begin();
            em.merge(c);
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
    public void remover(long idCliente) {
        EntityManager em = emFactory.createEntityManager();
        EntityTransaction transacao = em.getTransaction();
        try {
            transacao.begin();
            Usuario c = em.find(Usuario.class, idCliente);
            em.remove(c);

            transacao.commit();
        } catch (Exception e) {
            transacao.rollback();
        } finally {
            em.close();
        }
    }



}
