package com.matheus.training_java.exercicios;

import java.util.Scanner;

public class ExerciciosVariasTabuadas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero de tabuadas");
        int numero = scanner.nextInt();
        tabuadaAte(numero);
        scanner.close();
    }

    public static void tabuadaAte(int num){
        for (int contadorPrincipal = 1; contadorPrincipal < num+1; contadorPrincipal++){
            System.out.println("------------------");
            System.out.println("Tabuada do " + contadorPrincipal);
            System.out.println("------------------");
            for ( int contadorTabuada = 0; contadorTabuada <= 10; contadorTabuada++){
                int resultado = contadorPrincipal * contadorTabuada;
                System.out.println("O numero "+ contadorPrincipal +" X " + contadorTabuada + " = " + resultado );
            }
        }
    }
}
