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
package com.senac.spornet.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Eder Rodrigues
 */
//@Entity
//@Table(name="ITENS_VENDA")
public class ItensVenda implements Serializable{
    
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "ID_ITENS")
    private Long IdItens;
//    @Column(name = "ID_PRODUTO")
    private Long IdProduto;
//    @Column(name = "ID_VENDA")
    private Long IdVenda;

    public ItensVenda() {
    }

    public ItensVenda(Long IdItens, Long IdProduto, Long IdVenda) {
        this.IdItens = IdItens;
        this.IdProduto = IdProduto;
        this.IdVenda = IdVenda;
    }

    public Long getIdItens() {
        return IdItens;
    }

    public void setIdItens(Long IdItens) {
        this.IdItens = IdItens;
    }

    public Long getIdProduto() {
        return IdProduto;
    }

    public void setIdProduto(Long IdProduto) {
        this.IdProduto = IdProduto;
    }

    public Long getIdVenda() {
        return IdVenda;
    }

    public void setIdVenda(Long IdVenda) {
        this.IdVenda = IdVenda;
    }
    
    
}
