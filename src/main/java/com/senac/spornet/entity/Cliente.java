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

    @Column(name = "ENDERECO", nullable = false)
    private String endereco;

    @Column(name = "DT_NASCIMENTO", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtNascimento;

    public Cliente() {
    }

    public Cliente(Long id, String nome, Date dtNascimento, String cpf, String sexo,
            String email, String login, String senha, String endereco) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.email = email;
        this.login = login;
        this.senha = senha;
        this.endereco = endereco;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nome=" + nome + ", dtNascimento=" + dtNascimento
                + ", sexo=" + sexo + ", cpf=" + cpf + ", endereco=" + endereco + ", email=" + email + ", login=" + login + ", senha=" + senha + '}';
    }

}
