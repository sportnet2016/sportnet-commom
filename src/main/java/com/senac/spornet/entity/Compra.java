/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.spornet.entity;

/**
 *
 * @author nliggia-ibm
 */
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Compra implements Serializable {

    private Long id;

    private Date dtCriacao;

    private Date dtCompra;

    private Cliente usuario;

    //atributo que verifica se a compra foi concluída ou não
    private boolean isConcluido;

    private List<ItemCompra> itensCompra;

    public Compra() {

    }

    public Compra(Long id, Date dtCompra, Cliente usuario) {
        this.id = id;
        this.dtCriacao = new Date();
        this.dtCompra = dtCompra;
        this.usuario = usuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDtCompra() {
        return dtCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dtCompra = dataCompra;
    }

    public Cliente getUsuario() {
        return usuario;
    }

    public void setUsuario(Cliente usuario) {
        this.usuario = usuario;
    }

    public boolean getIsConcluido() {
        return isConcluido;
    }

    public void setIsConcluido(boolean isConcluido) {
        this.isConcluido = isConcluido;
    }

    public List<ItemCompra> getItensCompra() {
        return itensCompra;
    }

    public void setItensCompra(List<ItemCompra> itensCompra) {
        this.itensCompra = itensCompra;
    }

    @Override
    public String toString() {
        return "Compra{" + "id=" + id + ", dtCompra=" + dtCompra + ", usuario=" + usuario + ", itensCompra=" + itensCompra + '}';
    }

}
