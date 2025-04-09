package com.matheus.training_java.exercicios;

import java.util.Scanner;

public class ExercicioParImpar {

//    1. Par ou Ímpar
//    Escreva um programa que leia um número inteiro e diga se ele é par ou ímpar.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero");
        int numero = scanner.nextInt();

        imparOuPar(numero);
        scanner.close();
    }

        public static void imparOuPar(int numero){

            if (numero % 2 == 0){
                System.out.println(numero + " é par");
            }else {
                System.out.println(numero + " é impar");
            }

        }


}
