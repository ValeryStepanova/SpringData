package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import org.example.entity.Cat;
import org.example.repository.CatRepositoryCustom;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CatRepositoryImpl implements CatRepositoryCustom {

    private final EntityManagerFactory entityManagerFactory;

    @Autowired
    public CatRepositoryImpl(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

    @Override
    public List<Cat> findByName(String name) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        List<Cat> list = entityManager.createQuery("select c from Cat c where c.name =:name", Cat.class) //jpql
                .setParameter("name", name).getResultList();
        transaction.commit();
        return list;
    }
}
