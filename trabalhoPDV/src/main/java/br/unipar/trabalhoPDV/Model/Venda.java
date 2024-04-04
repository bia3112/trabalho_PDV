/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.trabalhoPDV.Model;

/**
 *
 * @author vinid
 */
public class Venda {
    private int Id_Venda;
    private Cliente Id_cliente;
    private double Valor_total;
    private double desconto_total;
    private double qtd_total_itens;

    public Venda() {
    }

    public Venda(int Id_Venda, Cliente Id_cliente, double Valor_total, double desconto_total, double qtd_total_itens) {
        this.Id_Venda = Id_Venda;
        this.Id_cliente = Id_cliente;
        this.Valor_total = Valor_total;
        this.desconto_total = desconto_total;
        this.qtd_total_itens = qtd_total_itens;
    }

    public int getId_Venda() {
        return Id_Venda;
    }

    public void setId_Venda(int Id_Venda) {
        this.Id_Venda = Id_Venda;
    }

    public Cliente getId_cliente() {
        return Id_cliente;
    }

    public void setId_cliente(Cliente Id_cliente) {
        this.Id_cliente = Id_cliente;
    }

    public double getValor_total() {
        return Valor_total;
    }

    public void setValor_total(double Valor_total) {
        this.Valor_total = Valor_total;
    }

    public double getDesconto_total() {
        return desconto_total;
    }

    public void setDesconto_total(double desconto_total) {
        this.desconto_total = desconto_total;
    }

    public double getQtd_total_itens() {
        return qtd_total_itens;
    }

    public void setQtd_total_itens(double qtd_total_itens) {
        this.qtd_total_itens = qtd_total_itens;
    }
    
    
    
}
