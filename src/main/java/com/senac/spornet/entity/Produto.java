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
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "TB_PRODUTO")
@NamedQueries({
    @NamedQuery(name = "Produto.listarPorCategoria",
            query = "SELECT DISTINCT p FROM Produto p " // Espaço 
            + "LEFT JOIN FETCH p.categorias " // antes
            + "LEFT JOIN FETCH p.imagens " // das aspas
            + "INNER JOIN p.categorias c "
            + "WHERE c.id = :idCategoria"),
    @NamedQuery(name = "Produto.obter",
            query = "SELECT DISTINCT p FROM Produto p "
            + "LEFT JOIN FETCH p.categorias "
            + "LEFT JOIN FETCH p.imagens "
            + "WHERE p.id = :idProduto"),
    @NamedQuery(name = "Produto.likeSearchProduct",
            query = "SELECT DISTINCT p FROM Produto p "
            + "LEFT JOIN FETCH p.categorias "
            + "LEFT JOIN FETCH p.imagens "
            + "WHERE p.nome LIKE ?1")
})
public class Produto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PRODUTO")
    private Long id;

    @Column(name = "NM_PRODUTO", nullable = false)
    private String nome;
    
    @Column(name = "NM_MARCA", nullable = false)
    private String marca;

    @Column(name = "DS_PRODUTO")
    private String descricao;

    @Column(name = "TM_PRODUTO")
    private String tamanho;

    @Column(name = "COR_PRODUTO")
    private String cor;
//
    @Column(name = "QTD_ATUAL")
    private int qtdAtual;
//
//    //masculino ou femino
    @Column(name = "GN_PRODUTO")
    private String genero;
    @Column(name = "VL_PRODUTO", precision = 12,
            scale = 2, nullable = false)
    private float preco;

    @Column(name = "DT_CADASTRO", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCadastro;

//    @Column(name = "Quantidade", nullable = false)
//    private String quantidade;

    @ManyToMany
    @JoinTable(name = "TB_PRODUTO_CATEGORIA",
            joinColumns = {
                @JoinColumn(name = "ID_PRODUTO")
            },
            inverseJoinColumns = {
                @JoinColumn(name = "ID_CATEGORIA")
            })
    private List<Categoria> categorias;

    @OneToMany(mappedBy = "produto", cascade = CascadeType.REMOVE)
    private List<ImagemProduto> imagens;

    @Transient
    private List<ItemCompra> itensCompra;
    
    @ManyToMany(mappedBy="produtos")
    private List<Venda> vendas;

    public Produto() {

    }

    public Produto(Long id, String nome, String descricao, float preco, Date dtCadastro) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.dtCadastro = dtCadastro;
    }

    public Produto(Long id, String nome, String descricao, float preco, Date dtCadastro, List<ImagemProduto> imagens, List<Categoria> categorias) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.dtCadastro = dtCadastro;
        this.imagens = imagens;
        this.categorias = categorias;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public Date getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(Date dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

//    public int getQtdAtual() {
//        return qtdAtual;
//    }
//    public void setQtdAtual(int qtdAtual) {
//        this.qtdAtual = qtdAtual;
//    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }

    public List<ImagemProduto> getImagens() {
        return imagens;
    }

    public void setImagens(List<ImagemProduto> imagens) {
        this.imagens = imagens;
    }

    public List<ItemCompra> getItensCompra() {
        return itensCompra;
    }

    public void setItensCompra(List<ItemCompra> itensCompra) {
        this.itensCompra = itensCompra;
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", preco=" + preco + ", dtCadastro=" + dtCadastro + ", categorias=" + categorias + ", imagens=" + imagens + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produto other = (Produto) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
//
//    public String getQuantidade() {
//        return quantidade;
//    }
//
//    public void setQuantidade(String quantidade) {
//        this.quantidade = quantidade;
//    }
//    

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
    
    //metodo que pega a primeira imagem da lista de produtos e torna como principal para mostrar na lista (listaTenis.xml)
    public String getImagemPrincipal(){
        if (imagens == null || imagens.size() <= 0) {
            return "";
        }
        return imagens.get(0).getNomeArquivo();
    }

    public List<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(List<Venda> vendas) {
        this.vendas = vendas;
    }
    
    
    

}
