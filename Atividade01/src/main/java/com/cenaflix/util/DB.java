package com.cenaflix.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Classe para gerenciar conexões com o banco de dados.
*/

public class DB {

    private static Connection conn;
    private static final String DB_URL = "jdbc:mysql://localhost:3306/cenaflix";
    private static final String DB_USER = "dev";
    private static final String DB_PASSWORD = "123456";
    
    /**
     * Obtém uma conexão com o banco de dados.
     * Esse método é sincronizado para garantir que apenas uma conexão seja criada.
     * 
     * @return A conexão com o banco de dados.
     */
    public static synchronized Connection getConnection() {
        if (conn == null) {
            try {
                conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            } catch (SQLException e) {
                // Exceção não retorna erro especifico por questões de segurança.
            }
        }
        return conn;
    }
    
    /**
     * Fecha a conexão com o banco de dados.
     * Esse método deve ser chamado para liberar os recursos junto do finally.
     */
    public static void closeConnection() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                // Exceção não retorna erro especifico por questões de segurança.
            } finally {
                conn = null;
            }
        }
    }
    
    /**
     * Fecha o objeto PreparedStatement.
     *
     * @param st O PreparedStatement a ser fechado.
     */
    public static void closeSt(PreparedStatement st) { 
        if (st != null) {
            try {
                st.close();
            } catch (SQLException e) {
                // Exceção não retorna erro especifico por questões de segurança. 
            }
        }
    }
    
    /**
     * Fecha o objeto ResultSet.
     * 
     * @param rs O ResultSet a ser fechado.
     */
    public static void closeRs(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                // Exceção não retorna erro especifico por questões de segurança.
            }
        }
    }
}
