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
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Eder Rodrigues
 */
@Entity
@Table(name = "TB_VENDA")
public class Venda implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_VENDA")
    private long IdVenda;
    @Column(name = "ID_CLIENTE")
    private long IdCliente;
    @Column(name = "DT_VENDA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date DtVenda;
    @Column(name = "VL_TOTAL")
    private float VlTotal;

    public Venda() {
    }

    public Venda(long IdVenda, long IdCliente, Date DtVenda, float VlTotal) {
        this.IdVenda = IdVenda;
        this.IdCliente = IdCliente;
        this.DtVenda = DtVenda;
        this.VlTotal = VlTotal;
    }

    public long getIdVenda() {
        return IdVenda;
    }

    public void setIdVenda(long IdVenda) {
        this.IdVenda = IdVenda;
    }

    public long getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(long IdCliente) {
        this.IdCliente = IdCliente;
    }

    public Date getDtVenda() {
        return DtVenda;
    }

    public void setDtVenda(Date DtVenda) {
        this.DtVenda = DtVenda;
    }

    public float getVlTotal() {
        return VlTotal;
    }

    public void setVlTotal(float VlTotal) {
        this.VlTotal = VlTotal;
    }
    
    
}
