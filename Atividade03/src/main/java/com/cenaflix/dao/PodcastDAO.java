package com.cenaflix.dao;

import com.cenaflix.model.Podcast;
import com.cenaflix.util.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

/**
 *  Classe gerencia entidades de Podcast no banco de dados.
 * 
 */
public class PodcastDAO {

    /**
     * Insere um novo objeto Podcast no banco de dados.
     * 
     * @param podcast O objeto Podcast a ser inserido.
     */
    public void insertPodcast(Podcast podcast) {
        EntityManager entityManager = JPAUtil.getEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(podcast);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
        } finally {
            JPAUtil.closeEntityManager();
        }
    }
    
    /**
     * Exclui um objeto Podcast do banco de dados com base no seu ID.
     * 
     * @param id O ID do Podcast a ser excluído.
     */
    public void deletePodcast(int id){
        EntityManager entityManager = JPAUtil.getEntityManager();
        try {
            Podcast podcast = entityManager.find(Podcast.class, id);
            entityManager.getTransaction().begin();
            entityManager.remove(podcast);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
        } finally {
            JPAUtil.closeEntityManager();
        }
    }

    /**
     * Recupera uma lista de objetos Podcast do banco de dados com base em um filtro.
     * 
     * @param filter O filtro de busca para os Podcasts pelo nome do produtor. Passe null ou uma string vazia para listar todos os Podcasts.
     * @return Uma lista de objetos Podcast que correspondem aos critérios de filtro, ou null se ocorrer um erro.
     */
    public List<Podcast> getPodcast(String filter) {
        EntityManager entityManager = JPAUtil.getEntityManager();
        try {
            Query query = entityManager.createQuery( "SELECT p FROM Podcast p WHERE :filter IS NULL OR p.produtor LIKE :filter", Podcast.class);
            query.setParameter("filter", filter.isEmpty() ? null : "%" + filter + "%");
            return query.getResultList();
        } catch (Exception e) {
            return null;
        } finally {
            JPAUtil.closeEntityManager();
        }
    }
}
