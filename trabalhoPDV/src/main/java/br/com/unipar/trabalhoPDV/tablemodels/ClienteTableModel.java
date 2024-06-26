/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unipar.trabalhoPDV.tablemodels;

import br.unipar.trabalhoPDV.model.Cliente;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vinid
 */
public class ClienteTableModel  extends DefaultTableModel {
      
    public ClienteTableModel() {
        this.addColumn("Nome");
        this.addColumn("Telefone");
        this.addColumn("Cpf");
    }
    
    public ClienteTableModel(List<Cliente> listCliente) {
        this();
        
        for (Cliente cliente : listCliente) {
            this.addRow(new String[] {
                cliente.getNome(),
                cliente.getTelefone(),
                cliente.getCpf()});
        }
    }
    
    public static String getSelectedCliente(JTable table, 
            List<Cliente> listaCliente) {
        
        int row = table.getSelectedRow();
        if (row != -1) {
            Cliente cliente = listaCliente.get(row);
            return cliente.getNome(); // Supondo que a descrição do produto é um atributo "descricao"
            
        }
        
        return null;
    }
    
}
