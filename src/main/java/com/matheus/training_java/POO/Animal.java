package com.matheus.training_java.POO;

import lombok.Getter;

public abstract class Animal {

    @Getter
    private String nome;
    private int idade;
    private String raca;

    public Animal(String nome, int idade, String raca){
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
    }

    public abstract void fazerSom();

    public void andar(){
        System.out.println(nome + " esta caminhando");
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome + ", Idade: " + idade + ", Raça: " + raca);
    }
}
