/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.trabalhoPDV.interfaces;

import br.unipar.trabalhoPDV.model.Produto;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author Beatr
 */
public class ProdutoDAOImpl implements ProdutoDAO {
    
    private EntityManager entityManager;

    public ProdutoDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    @Override
    public Produto save(Produto produto) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(produto);
        transaction.commit();
        entityManager.close();
        
        System.out.println("Produto salvo com sucesso!");
        return produto;
               
    }

    @Override
    public Produto update(Produto produto) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.merge(produto);
        transaction.commit();
        entityManager.close();
        
        System.out.println("Produto atualizado com sucesso!");
        return produto;
    }

    @Override
    public Boolean delete(Produto produto) {
        EntityTransaction transaction = entityManager.getTransaction();
        
        try {
            
            transaction.begin();
            entityManager.remove(produto);
            transaction.commit();
            entityManager.close();
            
            System.out.println("Produto removido com sucesso!");
            return true;
            
        } catch (Exception e) {
            
            transaction.rollback();
            System.out.println("Produto atualizado com sucesso!");
            return false;
            
        }
    }

    @Override
    public Produto findById(Integer id) {
        return entityManager.find(Produto.class, id);
    }

    @Override
    public List<Produto> findAll() {
        return entityManager.createQuery("SELECT c FROM Produto c", 
                Produto.class).getResultList();
    }
    
}
