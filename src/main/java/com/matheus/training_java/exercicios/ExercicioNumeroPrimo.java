package com.matheus.training_java.exercicios;

public class ExercicioNumeroPrimo {

    public static void main(String[] args) {
        numeroPrimo(28);
        ExercicioContador contador = new ExercicioContador();
        contador.listaAte10();
    }

    public static void numeroPrimo(int numero) {

        if (numero == 2){
            System.out.println("É primo");
            return;
        }
        if (numero < 2) {
            System.out.println("Não é número primo");
            return;
        }
        if (numero % 2 == 0) {
            System.out.println("Não é número primo");
            return;
        }

        for (int i = 3; i * i <= numero; i += 2){
            if (numero % i == 0){
                System.out.println("Não é um numero primo");
                return;
            }
        }
        System.out.println("É um número primo");
    }

}
