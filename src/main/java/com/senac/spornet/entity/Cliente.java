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

public class Cliente implements Serializable {

  private Long id;

  private String nome;

  private Date dtCadastro;

  private Date dtNascimento;

  public Cliente() {
  }

  public Cliente(Long id, String nome, Date dtCadastro, Date dtNascimento) {
    this.id = id;
    this.nome = nome;
    this.dtCadastro = dtCadastro;
    this.dtNascimento = dtNascimento;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Date getDtCadastro() {
    return dtCadastro;
  }

  public void setDtCadastro(Date dtCadastro) {
    this.dtCadastro = dtCadastro;
  }

  public Date getDtNascimento() {
    return dtNascimento;
  }

  public void setDtNascimento(Date dtNascimento) {
    this.dtNascimento = dtNascimento;
  }

  @Override
  public String toString() {
    return "Cliente{" + "id=" + id + ", nome=" + nome + ", dtCadastro=" + dtCadastro + ", dtNascimento=" + dtNascimento + '}';
  }

}

