/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.trabalhoPDV.interfaces;

import br.unipar.trabalhoPDV.model.Cliente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author vinid
 */
public class ClienteDAOImpl implements ClienteDao {
     private EntityManager entityManager;

    public ClienteDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Cliente save(Cliente cliente) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(cliente);
        transaction.commit();
        entityManager.close();
        
        System.out.println("Cliente salvo com sucesso!");
        return cliente;
    }

    @Override
    public Cliente update(Cliente cliente) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.merge(cliente);
        transaction.commit();
        entityManager.close();
        
        System.out.println("Cliente atualizado com sucesso!");
        return cliente;
    }

    @Override
    public Boolean delete(Cliente cliente) {        
        EntityTransaction transaction = entityManager.getTransaction();
        
        try {
            transaction.begin();
            entityManager.remove(cliente);
            transaction.commit();
            entityManager.close();

            System.out.println("Cliente removido com sucesso!");
            return true;
        } catch (Exception e) {
            transaction.rollback();
            System.out.println("Cliente atualizado com sucesso!");
            return false;
        }
       
    }

    @Override
    public Cliente findById(Integer id) {
        return entityManager.find(Cliente.class, id);
    }

     public List<Cliente> findAll() {

        return entityManager.createQuery("SELECT c FROM Cliente c",
                Cliente.class).getResultList();
                
    }
}
