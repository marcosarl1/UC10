package com.cenaflix.dao;

import com.cenaflix.model.Filme;
import com.cenaflix.util.DB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe de acesso a dados para operações relacionadas a filmes.
 */
public class FilmeDAO {

    private static Connection conn = null;
    private static PreparedStatement st = null;
    private static ResultSet rs = null;
    private static final String INSERT_MOVIE
            = "INSERT INTO filmes (nome, datalancamento, categoria) VALUES (?, ?, ?)";
    private static final String SELECT_ALL_MOVIES
            = "SELECT * FROM filmes";
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

    /**
     * Seleciona todos os filmes do banco de dados
     * @return Uma lista de objetos Filme contendo todos os filmes
     * @throws SQLException Se ocorrer um erro ao acessar o banco de dados.
     */
    public List<Filme> selectAllMovies() throws SQLException{
        List<Filme> filmes = new ArrayList<>();
        try {
            conn = DB.getConnection();
            st = conn.prepareStatement(SELECT_ALL_MOVIES);
            rs = st.executeQuery();
            while (rs.next()) {                
                Filme filme = new Filme();
                filme.setId(rs.getInt("id"));
                filme.setNome(rs.getString("nome"));
                filme.setDatalancamento(rs.getDate("datalancamento").toLocalDate());
                filme.setCategoria(rs.getString("categoria"));
                filmes.add(filme);
            }
        } catch (SQLException e) {
            throw e;
        } finally {
            DB.closeConnection();
            DB.closeSt(st);
            DB.closeRs(rs);
        }
        return filmes;
    }
}
