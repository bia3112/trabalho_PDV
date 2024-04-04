/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.trabalhoPDV.Model;

/**
 *
 * @author vinid
 */
public class Cliente {
    private int Id_Cliente;
    private String Nome;
    private String Telefone;
    private String Cpf;

    public Cliente() {
    }

    public Cliente(int Id_Cliente, String Nome, String Telefone, String Cpf) {
        this.Id_Cliente = Id_Cliente;
        this.Nome = Nome;
        this.Telefone = Telefone;
        this.Cpf = Cpf;
    }

    public int getId_Cliente() {
        return Id_Cliente;
    }

    public void setId_Cliente(int Id_Cliente) {
        this.Id_Cliente = Id_Cliente;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }
    
}
