package com.cenaflix.dao;

import com.cenaflix.model.Usuario;
import com.cenaflix.util.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;

/**
 * Classe gerencia entidades de Usuario no banco de dados.
 * 
 */
public class UsuarioDAO {

    /**
     * Realiza a autenticação de um usuário com base no nome de usuário e senha fornecidos.
     * 
     * @param username O nome de usuário do usuário a ser autenticado.
     * @param password A senha do usuário a ser autenticado.
     * @return O objeto Usuario correspondente se a autenticação for bem sucedida, ou null se não encontrar nenhum usuário com as credenciais fornecidas.
     */
    public Usuario auth(String username, String password) {
        EntityManager entityManager = JPAUtil.getEntityManager();
        try {
            TypedQuery<Usuario> query = entityManager.createQuery("SELECT u FROM Usuario u WHERE u.username = :username AND u.password = :password", Usuario.class);
            query.setParameter("username", username);
            query.setParameter("password", password);
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        } catch (Exception e) {
            return null;
        } finally {
            JPAUtil.closeEntityManager();
        }
    }
}
