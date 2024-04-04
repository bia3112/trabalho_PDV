/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.trabalhoPDV.Model;

/**
 *
 * @author vinid
 */
public class Item_venda {
    private int id_Item_venda;
    private Venda Id_Venda;
    private Produto Id_Produto;
    private String Descricao;
    private int qtd;
    private double valor_unitario;
    private double valor_total;
    private double desconto_un;

    public Item_venda() {
    }

    public Item_venda(int id_Item_venda, Venda Id_Venda, Produto Id_Produto, String Descricao, int qtd, double valor_unitario, double valor_total, double desconto_un) {
        this.id_Item_venda = id_Item_venda;
        this.Id_Venda = Id_Venda;
        this.Id_Produto = Id_Produto;
        this.Descricao = Descricao;
        this.qtd = qtd;
        this.valor_unitario = valor_unitario;
        this.valor_total = valor_total;
        this.desconto_un = desconto_un;
    }

    public int getId_Item_venda() {
        return id_Item_venda;
    }

    public void setId_Item_venda(int id_Item_venda) {
        this.id_Item_venda = id_Item_venda;
    }

    public Venda getId_Venda() {
        return Id_Venda;
    }

    public void setId_Venda(Venda Id_Venda) {
        this.Id_Venda = Id_Venda;
    }

    public Produto getId_Produto() {
        return Id_Produto;
    }

    public void setId_Produto(Produto Id_Produto) {
        this.Id_Produto = Id_Produto;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double getValor_unitario() {
        return valor_unitario;
    }

    public void setValor_unitario(double valor_unitario) {
        this.valor_unitario = valor_unitario;
    }

    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }

    public double getDesconto_un() {
        return desconto_un;
    }

    public void setDesconto_un(double desconto_un) {
        this.desconto_un = desconto_un;
    }
    
    
    
    
    
    
}
