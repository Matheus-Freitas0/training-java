package com.matheus.training_java.POO;

public class Cachorro extends Animal{

    public Cachorro(String name, int idade, String raca) {
        super(name, idade, raca);
    }

    @Override
    public void fazerSom(){
        System.out.println("Au AU AU");
    }
    @Override
    public void andar(){
        System.out.println(getNome() + " esta correndo igual doida");
    }
}
