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
    private static final String SELECT_MOVIE_BY_ID
            = "SELECT * FROM filmes WHERE id=?";
    private static final String EDIT_MOVIE
            = "UPDATE filmes SET nome=?, datalancamento=?, categoria=? WHERE id=?";
    private static final String DELETE_MOVIE
            = "DELETE FROM filmes WHERE id=?";
    private static final String SEARCH_MOVIE
            = "SELECT * FROM filmes WHERE nome LIKE ? OR categoria LIKE ?";
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
     *
     * @return Uma lista de objetos Filme contendo todos os filmes
     * @throws SQLException Se ocorrer um erro ao acessar o banco de dados.
     */
    public List<Filme> selectAllMovies() throws SQLException {
        List<Filme> filmes = new ArrayList<>();
        try {
            conn = DB.getConnection();
            st = conn.prepareStatement(SELECT_ALL_MOVIES);
            rs = st.executeQuery();
            while (rs.next()) {
                Filme filme = createMovie(rs);
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

    /**
     * Seleciona um filme pelo seu ID.
     * 
     * @param id O ID do filme a ser selecionado.
     * @return O objeto Filme correspondente ao ID fornecido.
     * @throws SQLException Se ocorrer um erro ao acessar o banco de dados.
     */
    public Filme selectMovie(int id) throws SQLException {
        try {
            conn = DB.getConnection();
            st = conn.prepareStatement(SELECT_MOVIE_BY_ID);
            st.setInt(1, id);
            rs = st.executeQuery();
            rs.next();
            Filme filme = createMovie(rs);
            return filme;
        } catch (SQLException e) {
            throw e;
        } finally {
            DB.closeConnection();
            DB.closeSt(st);
            DB.closeRs(rs);
        }
    }

    /**
     * Edita as informações de um filme existente.
     * 
     * @param filme O objeto Filme contendo as informações atualizadas.
     * @throws SQLException Se ocorrer um erro ao acessar o banco de dados.
     */
    public void editMovie(Filme filme) throws SQLException {
        try {
            conn = DB.getConnection();
            st = conn.prepareStatement(EDIT_MOVIE);
            st.setString(1, filme.getNome());
            st.setString(2, filme.getDatalancamento().format(FORMATTER));
            st.setString(3, filme.getCategoria());
            st.setInt(4, filme.getId());
            st.execute();
        } catch (SQLException e) {
            throw e;
        } finally {
            DB.closeConnection();
            DB.closeSt(st);
        }
    }

    /**
     * Deleta um filme pelo seu ID.
     * 
     * @param id O ID do filme a ser deletado.
     * @throws SQLException Se ocorrer um erro ao acessar o banco de dados.
     */
    public void deleteMovie(int id) throws SQLException {
        try {
            conn = DB.getConnection();
            st = conn.prepareStatement(DELETE_MOVIE);
            st.setInt(1, id);
            st.execute();
        } catch (SQLException e) {
            throw e;
        } finally {
            DB.closeConnection();
            DB.closeSt(st);
        }
    }

    /**
     * Pesquisa filmes pelo nome ou categoria.
     * 
     * @param query A string de consulta a ser pesquisada.
     * @return Uma lista de objetos Filme que correspondem à consulta.
     * @throws SQLException Se ocorrer um erro ao acessar o banco de dados.
     */
    public List<Filme> searchMovie(String query) throws SQLException {
        List<Filme> filmes = new ArrayList<>();
        String searchQuery = "%" + query + "%";
        try {
            conn = DB.getConnection();
            st = conn.prepareStatement(SEARCH_MOVIE);
            st.setString(1, searchQuery);
            st.setString(2, searchQuery);
            rs = st.executeQuery();
            while (rs.next()) {                
                Filme filme = createMovie(rs);
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

    /**
     * Cria um objeto Filme a partir de um ResultSet.
     * 
     * @param rs O ResultSet contendo os dados do filme.
     * @return Um objeto filme.
     * @throws SQLException Se ocorrer um erro ao acessar o banco de dados.
     */
    private Filme createMovie(ResultSet rs) throws SQLException {
        return new Filme(rs.getInt("id"), rs.getString("nome"), rs.getDate("datalancamento").toLocalDate(),rs.getString("categoria"));
    }
}
