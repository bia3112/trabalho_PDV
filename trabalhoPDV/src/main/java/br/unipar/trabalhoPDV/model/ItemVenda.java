/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.trabalhoPDV.model;

/**
 *
 * @author Beatr
 */

public class ItemVenda {
    
    private Produto produtoId;
    private Venda vendaId;
    private String descricao;
    private int qtd;
    private double vlUnitario;
    private double vlTotal;
    private double descontoUn;

    public ItemVenda(Produto produtoId, Venda vendaId, String descricao, 
            int qtd, double vlUnitario, double vlTotal, double descontoUn) {
        this.produtoId = produtoId;
        this.vendaId = vendaId;
        this.descricao = descricao;
        this.qtd = qtd;
        this.vlUnitario = vlUnitario;
        this.vlTotal = vlTotal;
        this.descontoUn = descontoUn;
    }

    public Produto getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(Produto produtoId) {
        this.produtoId = produtoId;
    }

    public Venda getVendaId() {
        return vendaId;
    }

    public void setVendaId(Venda vendaId) {
        this.vendaId = vendaId;
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
 
}
