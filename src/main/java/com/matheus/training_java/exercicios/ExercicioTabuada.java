package com.matheus.training_java.exercicios;

import java.util.Scanner;

public class ExercicioTabuada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero");
        int numero = scanner.nextInt();
        tabuada(numero);
        scanner.close();

    }

    public static void tabuada(int numero) {
        for (int contador = 1; contador < 11; contador++) {
            int resultado = numero * contador;
            System.out.println(numero + " X " + contador + " = " + resultado);
        }
    }

}
