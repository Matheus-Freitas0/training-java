package com.matheus.training_java.exercicios;

public class ExercicioContador {

    public static void main(String[] args) {
        ExercicioContador contador = new ExercicioContador();
        contador.listaAte10();
    }

    public void listaAte10() {
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
    }


}
