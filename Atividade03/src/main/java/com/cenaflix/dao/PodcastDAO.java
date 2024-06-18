package com.cenaflix.dao;

import com.cenaflix.model.Podcast;
import com.cenaflix.util.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

public class PodcastDAO {

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

    public List<Podcast> getPodcast(String filter) {
        EntityManager entityManager = JPAUtil.getEntityManager();
        try {
            Query query = entityManager.createQuery( "SELECT p FROM Podcast p WHERE :filter IS NULL OR p.produtor LIKE :filter", Podcast.class);
            query.setParameter("filter", filter.isEmpty() ? null : "%" + filter + "%");
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            JPAUtil.closeEntityManager();
        }
    }
}
