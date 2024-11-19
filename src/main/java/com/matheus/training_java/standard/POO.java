package com.matheus.training_java.standard;

public class POO {
    String nome;

    static String nome2;

    public static void main(String[] args) {
        System.out.println(nome2);
    }

    void declaraNome(){
        nome = "Matheus";
        System.out.println(nome2);

    }

    String getNome(){
        return nome;
    }
}
