/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.spornet.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author nliggia-ibm
 */

@Entity
@Table(name = "TB_IMAGEM")
public class ImagemProduto implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_IMAGEM")
  private Long id;

  @Column(name = "NM_IMAGEM", nullable = false)
  private String nomeArquivo;

  @Column(name = "DS_IMAGEM")
  private String legenda;

  @ManyToOne
  @JoinColumn(name = "ID_PRODUTO", nullable = false)
  private Produto produto;

  public ImagemProduto() {

  }

  public ImagemProduto(Long id, String nomeArquivo, String legenda) {
    this.id = id;
    this.nomeArquivo = nomeArquivo;
    this.legenda = legenda;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNomeArquivo() {
    return nomeArquivo;
  }

  public void setNomeArquivo(String nomeArquivo) {
    this.nomeArquivo = nomeArquivo;
  }

  public String getLegenda() {
    return legenda;
  }

  public void setLegenda(String legenda) {
    this.legenda = legenda;
  }

  public Produto getProduto() {
    return produto;
  }

  public void setProduto(Produto produto) {
    this.produto = produto;
  }

  public String getUrlArquivo() {
    return "http://localhost:8080/imagens/" + nomeArquivo;
  }

  @Override
  public String toString() {
    return "ImagemProduto{" + "id=" + id + ", legenda=" + legenda + ", nomeArquivo=" + nomeArquivo + '}';
  }

}
