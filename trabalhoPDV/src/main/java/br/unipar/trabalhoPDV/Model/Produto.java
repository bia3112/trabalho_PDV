/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.trabalhoPDV.Model;

/**
 *
 * @author vinid
 */
public class Produto {
    private int Id_Produto;
    private String descricao;

    public Produto() {
    }

    public Produto(int Id_Produto, String descricao) {
        this.Id_Produto = Id_Produto;
        this.descricao = descricao;
    }

    public int getId_Produto() {
        return Id_Produto;
    }

    public void setId_Produto(int Id_Produto) {
        this.Id_Produto = Id_Produto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    
}
