/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unipar.trabalhoPDV.tablemodels;

import br.unipar.trabalhoPDV.model.ItemVenda;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Beatr
 */
public class ItemVendaTableModel extends DefaultTableModel {

    public ItemVendaTableModel() {
        this.addColumn("ProdutoId");
        this.addColumn("VendaId");
        this.addColumn("Descrição");
        this.addColumn("Qtd");
        this.addColumn("VlrUnitario");
        this.addColumn("VlrTotal");
        this.addColumn("DescontoUn");
    }
    
    public ItemVendaTableModel(List<ItemVenda> listItemVenda) {
        this();
        
        for(ItemVenda itemVenda : listItemVenda) {
            this.addRow(new String [] {
                String.valueOf(itemVenda.getProduto().getId()),
                String.valueOf(itemVenda.getVenda().getId()),
                itemVenda.getDescricao(),
                String.valueOf(itemVenda.getQtd()),
                String.valueOf(itemVenda.getVlUnitario()),
                String.valueOf(itemVenda.getVlTotal()),
                String.valueOf(itemVenda.getDescontoUn())
            });
        }     
    }
    
    public ItemVenda getSelectedItemVenda(JTable table,
            List<ItemVenda> itemVendas) {
        return null;
        
    }
    
}
