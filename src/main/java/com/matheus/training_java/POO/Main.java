package com.matheus.training_java.POO;

public class Main {

    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Pistache",6, "Yorkishire");
        Animal gato = new Gato("Vilao", 3, "Garfield");

        cachorro.exibirDados();
        cachorro.andar();

        gato.exibirDados();
        gato.fazerSom();
    }
}
