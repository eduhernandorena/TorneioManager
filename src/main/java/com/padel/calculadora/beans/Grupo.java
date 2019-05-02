package com.padel.calculadora.beans;

import java.util.List;

public class Grupo {
    private Long id;
    private Categoria categoria;
    private List<Participante> duplas;
    private List<Jogo> jogos;
    private Dupla campeoes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<Participante> getDuplas() {
        return duplas;
    }

    public void setDuplas(List<Participante> duplas) {
        this.duplas = duplas;
    }

    public List<Jogo> getJogos() {
        return jogos;
    }

    public void setJogos(List<Jogo> jogos) {
        this.jogos = jogos;
    }

    public Dupla getCampeoes() {
        return campeoes;
    }

    public void setCampeoes(Dupla campeoes) {
        this.campeoes = campeoes;
    }

    public Grupo() {
    }


    public class Participante extends Dupla {
        private Integer colocacao;
        private boolean finalista;

        public Participante() {
        }

        public Integer getColocacao() {
            return colocacao;
        }

        public void setColocacao(Integer colocacao) {
            this.colocacao = colocacao;
        }

        public boolean isFinalista() {
            return finalista;
        }

        public void setFinalista(boolean finalista) {
            this.finalista = finalista;
        }
    }
}
