/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.trabalhoPDV.model;

/**
 *
 * @author Beatr
 */
public class Venda {
    
    private int idVenda;
    private Cliente idCliente;
    private double valorTotal;
    private double descontoTotal;
    private int qtdTotalItems;

    public Venda() {
    }

    public Venda(int idVenda, Cliente idCliente, double valorTotal, double descontoTotal, int qtdTotalItems) {
        this.idVenda = idVenda;
        this.idCliente = idCliente;
        this.valorTotal = valorTotal;
        this.descontoTotal = descontoTotal;
        this.qtdTotalItems = qtdTotalItems;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getDescontoTotal() {
        return descontoTotal;
    }

    public void setDescontoTotal(double descontoTotal) {
        this.descontoTotal = descontoTotal;
    }

    public int getQtdTotalItems() {
        return qtdTotalItems;
    }

    public void setQtdTotalItems(int qtdTotalItems) {
        this.qtdTotalItems = qtdTotalItems;
    }
    
}
