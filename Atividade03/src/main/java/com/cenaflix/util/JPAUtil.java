package com.cenaflix.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Classe utilitária para gerenciamento do EntityManager do JPA (Hibernate).
 * 
 */
public class JPAUtil {
    
    private static final String PERSISTENCE_UNIT = "CenaflixPU";
    private static EntityManagerFactory entityManagerFactory;
    private static EntityManager entityManager;
    
    /**
     * Obtém o EntityManager para interação com o banco de dados.
     * 
     * @return O EntityManager configurado com o persistence unit "CenaflixPU".
     */
    public static EntityManager getEntityManager() {
        if (entityManagerFactory == null || !entityManagerFactory.isOpen()) {
            entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
            
            if (entityManager == null || !entityManager.isOpen()) {
                entityManager = entityManagerFactory.createEntityManager();
            }
        }
        return entityManager;
    }
    
    /**
     * Fecha o EntityManager e o EntityManagerFactory.
     */
    public static void closeEntityManager() {
        if (entityManager != null && entityManager.isOpen()) {
            entityManager.close();
            entityManagerFactory.close();
        }
    }
}
