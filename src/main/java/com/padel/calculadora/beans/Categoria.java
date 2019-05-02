package com.padel.calculadora.beans;

public class Categoria {
    private Long id;
    private Integer categoria;
    private String descricao;
    private Sexo sexo;
    private boolean iniciante;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCategoria() {
        return categoria;
    }

    public void setCategoria(Integer categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public boolean isIniciante() {
        return iniciante;
    }

    public void setIniciante(boolean iniciante) {
        this.iniciante = iniciante;
    }

    public enum Sexo{
        FEMININO, MASCULINO, MISTO, LIVRE;
    }
}
