/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.trabalhoPDV.interfaces;

import br.unipar.trabalhoPDV.model.Venda;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author vinid
 */
public class VendaDaoImpl implements VendaDao{
      private EntityManager entityManager;

    public VendaDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Venda save(Venda venda) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(venda);
        transaction.commit();
        entityManager.close();
        
        System.out.println("Venda salvo com sucesso!");
        return venda;
    }

    @Override
    public Venda update(Venda venda) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.merge(venda);
        transaction.commit();
        entityManager.close();
        
        System.out.println("Venda atualizado com sucesso!");
        return venda;
    }

    @Override
    public Boolean delete(Venda Venda) {        
        EntityTransaction transaction = entityManager.getTransaction();
        
        try {
            transaction.begin();
            entityManager.remove(Venda);
            transaction.commit();
            entityManager.close();

            System.out.println("Venda removido com sucesso!");
            return true;
        } catch (Exception e) {
            transaction.rollback();
            System.out.println("Venda atualizado com sucesso!");
            return false;
        }
       
    }

    @Override
    public Venda findById(Integer id) {
        return entityManager.find(Venda.class, id);
    }

    @Override
    public List<Venda> findAll() {

        return entityManager.createQuery("SELECT c FROM Venda c",
                Venda.class).getResultList();
                
    }
}

    

