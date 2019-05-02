package com.padel.calculadora;

import com.padel.calculadora.beans.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class CalculadoraApplication {

    private List<Dupla> duplas;

    public static void main(String[] args) {
        SpringApplication.run(CalculadoraApplication.class, args);

        Circuito circuito = new Circuito();
        circuito.setId(1L);
        circuito.setDescricao("Copa Sul 2ª Edição");
    }

    private void popularCircuito(Circuito circuito) {

    }

    private void getDuplas() {
        Categoria categ = new Categoria();
        categ.setCategoria(6);
        categ.setId(1L);
        categ.setDescricao("Iniciantes Misto");
        categ.setSexo(Categoria.Sexo.MISTO);
        categ.setIniciante(true);

        Restricao rest1 = new Restricao(1L, "Plantão", Restricao.Turno.NOITE, LocalDate.of(2019, 5, 3));
        Restricao rest2 = new Restricao(2L, "Plantão", Restricao.Turno.MANHA, LocalDate.of(2019, 5, 4));

        Jogador jog = new Jogador("Eduardo", 1L, rest1, categ);
        Jogador jog2 = new Jogador("Caroline", 2L, rest2, categ);

        Dupla dupla = new Dupla();
        dupla.setPlayerOne(jog);
        dupla.setPlayerOne(jog2);
    }


}
