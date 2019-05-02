package com.padel.calculadora.beans;

public class Dupla {
    private Long id;
    private Jogador playerOne;
    private Jogador playerTwo;

    public Dupla() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Jogador getPlayerOne() {
        return playerOne;
    }

    public void setPlayerOne(Jogador playerOne) {
        this.playerOne = playerOne;
    }

    public Jogador getPlayerTwo() {
        return playerTwo;
    }

    public void setPlayerTwo(Jogador playerTwo) {
        this.playerTwo = playerTwo;
    }
}
