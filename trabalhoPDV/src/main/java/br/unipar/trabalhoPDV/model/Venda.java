/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.trabalhoPDV.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
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
public class Venda {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double valorTotal;
    private double descontoTotal;
    private int qtdTotalItems;
    
    @ManyToOne
    private Cliente cliente;
    
    @OneToMany(mappedBy = "venda", cascade = CascadeType.MERGE)
    private List<ItemVenda> itens = new ArrayList<>();

    public Venda() {
    }

    public Venda(int id, Cliente cliente, double valorTotal, double descontoTotal, int qtdTotalItems) {
        this.id = id;
        this.cliente = cliente;
        this.valorTotal = valorTotal;
        this.descontoTotal = descontoTotal;
        this.qtdTotalItems = qtdTotalItems;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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

    public List<ItemVenda> getItens() {
        return itens;
    }
}
