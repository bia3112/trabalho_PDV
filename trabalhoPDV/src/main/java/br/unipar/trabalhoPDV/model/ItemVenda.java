/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.trabalhoPDV.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Beatr
 */

@Entity
public class ItemVenda {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String descricao;
    private int qtd;
    private double vlUnitario;
    private double vlTotal;
    private double descontoUn;
    
    @ManyToOne
    private Venda venda;
    
    @ManyToOne
    private Produto produto;
    
    public ItemVenda() { }

    public ItemVenda(int id, String descricao, int qtd, double vlUnitario, double vlTotal, double descontoUn, Venda venda, Produto produto) {
        this.id = id;
        this.descricao = descricao;
        this.qtd = qtd;
        this.vlUnitario = vlUnitario;
        this.vlTotal = vlTotal;
        this.descontoUn = descontoUn;
        this.venda = venda;
        this.produto = produto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double getVlUnitario() {
        return vlUnitario;
    }

    public void setVlUnitario(double vlUnitario) {
        this.vlUnitario = vlUnitario;
    }

    public double getVlTotal() {
        return vlTotal;
    }

    public void setVlTotal(double vlTotal) {
        this.vlTotal = vlTotal;
    }

    public double getDescontoUn() {
        return descontoUn;
    }

    public void setDescontoUn(double descontoUn) {
        this.descontoUn = descontoUn;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ItemVenda other = (ItemVenda) obj;
        return this.id == other.id;
    }
}
