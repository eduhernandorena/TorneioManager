package com.padel.calculadora.beans;

import java.time.LocalDate;

public class Restricao {
    private Long id;
    private String obs;
    private Turno turno;
    private LocalDate data;

    public Restricao(Long id, String obs, Turno turno, LocalDate data) {
        this.id = id;
        this.obs = obs;
        this.turno = turno;
        this.data = data;
    }

    public Restricao() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public enum Turno{
        MANHA, TARDE, NOITE;
    }
}
