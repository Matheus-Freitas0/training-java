package com.matheus.training_java.POO;

public class Passaro extends Animal implements PodeVoar {

    public Passaro(String nome, int idade, String raca) {
        super(nome, idade, raca);
    }

    @Override
    public void fazerSom() {
        System.out.println("piu piu piu");
    }

    public void voar() {
        System.out.println( getNome() + " esta voando");
    }
}
