package com.padel.calculadora.beans;

import java.time.LocalTime;

public class Jogo {
    private Long id;
    private Grupo.Participante duplaOne;
    private Grupo.Participante duplaTwo;
    private LocalTime horaJogo;
    private DiaJogo dia;

    public Jogo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Grupo.Participante getDuplaOne() {
        return duplaOne;
    }

    public void setDuplaOne(Grupo.Participante duplaOne) {
        this.duplaOne = duplaOne;
    }

    public Grupo.Participante getDuplaTwo() {
        return duplaTwo;
    }

    public void setDuplaTwo(Grupo.Participante duplaTwo) {
        this.duplaTwo = duplaTwo;
    }

    public LocalTime getHoraJogo() {
        return horaJogo;
    }

    public void setHoraJogo(LocalTime horaJogo) {
        this.horaJogo = horaJogo;
    }

    public DiaJogo getDia() {
        return dia;
    }

    public void setDia(DiaJogo dia) {
        this.dia = dia;
    }
}
