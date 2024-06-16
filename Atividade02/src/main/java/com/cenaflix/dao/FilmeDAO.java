package com.cenaflix.dao;

import com.cenaflix.model.Filme;
import com.cenaflix.util.DB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.format.DateTimeFormatter;

/**
 * Classe de acesso a dados para operações relacionadas a filmes.
 */
public class FilmeDAO {

    private static Connection conn = null;
    private static PreparedStatement st = null;
    private static final String INSERT_MOVIE
            = "INSERT INTO filmes (nome, datalancamento, categoria) VALUES (?, ?, ?)";
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy/MM/dd");

    /**
     * Insere um filme no banco de dados.
     * 
     * @param filme O filme a ser inserido
     * @throws SQLException Se ocorrer um erro ao acessar o banco de dados.
     */
    public static void insertMovie(Filme filme) throws SQLException {
        try {
            conn = DB.getConnection();
            st = conn.prepareStatement(INSERT_MOVIE);
            st.setString(1, filme.getNome());
            st.setString(2, filme.getDatalancamento().format(FORMATTER));
            st.setString(3, filme.getCategoria());
            st.executeUpdate();
        } catch (SQLException e) {
            throw e;
        } finally {
            DB.closeConnection();
            DB.closeSt(st);
        }
    }

}
