/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.unipar.trabalhoPDV.interfaces;

import br.unipar.trabalhoPDV.model.ItemVenda;
import java.util.List;

/**
 *
 * @author Beatr
 */
public interface ItemVendaDAO {
    
    ItemVenda save(ItemVenda itemVenda);
    ItemVenda update(ItemVenda itemVenda);
    Boolean delete(ItemVenda itemVenda);
    
    ItemVenda findById(Integer id); 
    List<ItemVenda> findAll();
    
}
