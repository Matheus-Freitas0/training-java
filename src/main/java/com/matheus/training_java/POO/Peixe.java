package com.matheus.training_java.POO;

public class Peixe extends Animal implements PodeNadar {
    public Peixe(String nome, int idade, String raca) {
        super(nome, idade, raca);
    }

    @Override
    public void fazerSom() {
        System.out.println("blu blu blu");
    }

    public void nadar() {
        System.out.println("Peixe está nadando");
    }
}
