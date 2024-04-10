/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unipar.trabalhoPDV.tablemodels;


import br.unipar.trabalhoPDV.model.Venda;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Beatr
 */
public class VendaTableModel extends DefaultTableModel {

    public VendaTableModel() {
        this.addColumn("ClienteId");
        this.addColumn("ValorTotal");
        this.addColumn("DescontoTotal");
        this.addColumn("QtdTotalItens");
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
    
      public Venda getSelectedProduto(JTable table, 
            List<Venda> produtos) {
        return null;
    }

    
    
    
}
