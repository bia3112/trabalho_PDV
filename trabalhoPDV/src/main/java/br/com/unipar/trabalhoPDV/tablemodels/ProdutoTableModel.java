package br.com.unipar.trabalhoPDV.tablemodels;

import br.unipar.trabalhoPDV.model.Produto;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ProdutoTableModel extends DefaultTableModel {

    public ProdutoTableModel() {
        this.addColumn("Código");
        this.addColumn("Descrição");
    }
    
    public ProdutoTableModel(List<Produto> listProduto) {
        this();
        
        for(Produto produto : listProduto) {
            this.addRow(new String[] {
                 String.valueOf(produto.getId()),
                produto.getDescricao()
            });
        }
    }
    
    public static String getSelectedProduto(JTable table, List<Produto> listaProdutos) {
        int row = table.getSelectedRow();
        if (row != -1) {
            Produto produto = listaProdutos.get(row);
            return produto.getDescricao(); 
            
        }
        
        return null;
    }
}
