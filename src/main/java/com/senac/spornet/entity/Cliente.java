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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "USUARIO_CLIENTE")

public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CLIENTE")
    private Long id;

    @Column(name = "NOME", nullable = false)
    private String nome;

    @Column(name = "CPF", nullable = false)
    private String cpf;

    @Column(name = "SEXO", nullable = false)
    private String sexo;

    @Column(name = "EMAIL", nullable = false)
    private String email;

    @Column(name = "LOGIN", nullable = false)
    private String login;

    @Column(name = "SENHA", nullable = false)
    private String senha;

    @Column(name = "END_RUA", nullable = false)
    private String endRua;

    @Column(name = "END_NUM", nullable = false)
    private int endNum;

    @Column(name = "END_COMPLEMENTO")
    private String endComplemento;
    
    @Column(name = "END_BAIRRO", nullable = false)
    private String endBairro;
    
    @Column(name = "END_CEP", nullable = false)
    private String endCep;
    
    @Column(name = "END_CIDADE", nullable = false)
    private String endCidade;
    
    @Column(name = "END_ESTADO", nullable = false)
    private String endEstado;

    @Column(name = "DT_NASCIMENTO", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtNascimento;

    public Cliente() {
    }

    public Cliente(Long id, String nome, Date dtNascimento, String cpf, String sexo,
            String email, String login, String senha, String endRua) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.email = email;
        this.login = login;
        this.senha = senha;
        this.endRua = endRua;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getEndRua() {
        return endRua;
    }

    public void setEndRua(String endRua) {
        this.endRua = endRua;
    }

    public int getEndNum() {
        return endNum;
    }

    public void setEndNum(int endNum) {
        this.endNum = endNum;
    }

    public String getEndComplemento() {
        return endComplemento;
    }

    public void setEndComplemento(String endComplemento) {
        this.endComplemento = endComplemento;
    }

    public String getEndBairro() {
        return endBairro;
    }

    public void setEndBairro(String endBairro) {
        this.endBairro = endBairro;
    }

    public String getEndCep() {
        return endCep;
    }

    public void setEndCep(String endCep) {
        this.endCep = endCep;
    }

    public String getEndCidade() {
        return endCidade;
    }

    public void setEndCidade(String endCidade) {
        this.endCidade = endCidade;
    }

    public String getEndEstado() {
        return endEstado;
    }

    public void setEndEstado(String endEstado) {
        this.endEstado = endEstado;
    }
    
    

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nome=" + nome + ", dtNascimento=" + dtNascimento
                + ", sexo=" + sexo + ", cpf=" + cpf + ", endRua=" + endRua + ", email=" + email + ", login=" + login + ", senha=" + senha + '}';
    }

}
