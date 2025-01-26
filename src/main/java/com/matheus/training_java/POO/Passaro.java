package com.matheus.training_java.POO;

public class Passaro extends Animal implements PodeVoar {

    public Passaro(String nome, int idade, String raca) {
        super(nome, idade, raca);
    }

    public void voar() {
        System.out.println("Passaro esta voando");
    }
}
