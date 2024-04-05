/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.unipar.trabalhoPDV.interfaces;

import br.unipar.trabalhoPDV.model.Venda;
import java.util.List;

/**
 *
 * @author vinid
 */
public interface VendaDao {
     Venda save(Venda venda);
     Venda update(Venda venda);
    Boolean delete(Venda venda);
    
    Venda findById(Integer id); 
    List<Venda> findAll();
      
}
