package com.padel.calculadora.beans;

import java.util.List;

public class Fase {
    private Long id;
    private List<DiaJogo> dias;
    private String descricao;

    public Fase() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<DiaJogo> getDias() {
        return dias;
    }

    public void setDias(List<DiaJogo> dias) {
        this.dias = dias;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
