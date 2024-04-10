/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unipar.trabalhoPDV.tablemodels;

import br.unipar.trabalhoPDV.model.Cliente;
import br.unipar.trabalhoPDV.model.Venda;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Beatr
 */
public class VendaTableModel extends DefaultTableModel {

    public VendaTableModel() {
        this.addColumn("ClienteId");
        this.addColumn("Valor Total");
        this.addColumn("Desconto Total");
        this.addColumn("Qtd Total Itens");
    }

    public VendaTableModel(List<Venda> listVenda) {
        this();
        
        for (Venda venda : listVenda) {
            this.addRow(new String[] {
                String.valueOf(venda.getIdCliente()),
                String.valueOf(venda.getValorTotal()),
                String.valueOf(venda.getDescontoTotal()),
                String.valueOf(venda.getQtdTotalItems())});
        }
    }
    
//    public getSelectedVenda(JTable table, List<Venda> vendas) {
//        return null;
//    }
    
    
    
}