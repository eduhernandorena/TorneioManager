package com.padel.calculadora.beans;

public class Jogador {
    private String nome;
    private Long id;
    private Restricao restricao;
    private Categoria categoria;

    public Jogador() {
    }

    public Jogador(String nome, Long id, Restricao restricao, Categoria categoria) {
        this.nome = nome;
        this.id = id;
        this.restricao = restricao;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Restricao getRestricao() {
        return restricao;
    }

    public void setRestricao(Restricao restricao) {
        this.restricao = restricao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
