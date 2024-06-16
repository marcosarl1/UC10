package com.cenaflix.model;

import java.time.LocalDate;

/**
 * Representa um filme com suas propriedades básicas GETTERS e SETTERS.
 */
public class Filme {
    
    private int id;
    private String nome;
    private LocalDate datalancamento;
    private String categoria;

    public Filme() {
    }

    public Filme(int id, String nome, LocalDate datalancamento, String categoria) {
        this.id = id;
        this.nome = nome;
        this.datalancamento = datalancamento;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDatalancamento() {
        return datalancamento;
    }

    public void setDatalancamento(LocalDate datalancamento) {
        this.datalancamento = datalancamento;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
