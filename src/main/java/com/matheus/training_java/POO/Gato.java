package com.matheus.training_java.POO;

public class Gato extends Animal{
    public Gato(String name, int idade, String raca) {
        super(name, idade, raca);
    }

    @Override
    public void fazerSom(){
        System.out.println(getNome() + " Faz Miau Miau Miau");
    }
    @Override
    public void andar(){
        System.out.println(getNome() + " esta pulando");
    }
}
