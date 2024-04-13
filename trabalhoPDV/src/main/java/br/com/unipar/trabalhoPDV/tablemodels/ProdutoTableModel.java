/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unipar.trabalhoPDV.tablemodels;

import br.unipar.trabalhoPDV.model.Produto;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Beatr
 */
public class ProdutoTableModel extends DefaultTableModel {

    public ProdutoTableModel() {
         this.addColumn("Codigo");
        this.addColumn("Descricao");
    }
    
    public ProdutoTableModel(List<Produto> listProduto) {
        this();
        
        for(Produto produto : listProduto) {
            this.addRow(new String[] {
                 String.valueOf(produto.getId()),
                produto.getDescricao()});
        }
        
    }
    
    public Produto getSelectedProduto(JTable table, 
            List<Produto> produtos) {
        return null;
    }
    
    
}
