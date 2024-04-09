/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.unipar.trabalhoPDV.interfaces;

import br.unipar.trabalhoPDV.model.Produto;
import java.util.List;

/**
 *
 * @author Beatr
 */
public interface ProdutoDAO {
    
    Produto save(Produto produto);
    Produto update(Produto produto);
    Boolean delete(Produto produto);
    
    Produto findById(Integer id); 
    List<Produto> findAll();
    
}
