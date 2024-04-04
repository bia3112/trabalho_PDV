/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.unipar.trabalhoPDV.Dao;

import br.unipar.trabalhoPDV.Model.Cliente;
import java.util.List;

/**
 *
 * @author vinid
 */
public interface ClienteDao {
    Cliente save(Cliente cliente);
    Cliente update(Cliente cliente);
    Boolean delete(Cliente cliente);
    
    Cliente findById(Integer id); 
    List<Cliente> findAll();
    
}
