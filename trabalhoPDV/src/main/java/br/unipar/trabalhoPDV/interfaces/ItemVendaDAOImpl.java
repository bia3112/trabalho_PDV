/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.trabalhoPDV.interfaces;

import br.unipar.trabalhoPDV.model.ItemVenda;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author Beatr
 */
public class ItemVendaDAOImpl implements ItemVendaDAO {
    
    private EntityManager entityManager;

    public ItemVendaDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public ItemVenda save(ItemVenda itemVenda) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(itemVenda);
        transaction.commit();
        entityManager.close();
        
        System.out.println("Item Venda salvo com sucesso!");
        return itemVenda;
    }

    @Override
    public ItemVenda update(ItemVenda itemVenda) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.merge(itemVenda);
        transaction.commit();
        entityManager.close();
        
        System.out.println("Item Venda atualizado com sucesso!");
        return itemVenda;
    }

    @Override
    public Boolean delete(ItemVenda itemVenda) {
        EntityTransaction transaction = entityManager.getTransaction();
        
        try {
          transaction.begin();
          entityManager.remove(itemVenda);
          transaction.commit();
          entityManager.close();
          
            System.out.println("Item Venda removido com sucesso!");
            return true;
        }catch (Exception ex) {
            transaction.rollback();
            System.out.println("Item Venda atualizado com sucesso!");
            return false;
        }
    }

    @Override
    public ItemVenda findById(Integer id) {
        return entityManager.find(ItemVenda.class, id);
    }

    @Override
    public List<ItemVenda> findAll() {
        return entityManager.createQuery("SELECT C FROM ITEM_VENDA C", 
                ItemVenda.class).getResultList();
    }
    
}
