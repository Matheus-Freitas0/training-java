package com.matheus.training_java.exercicios;

public class ExercicioMaiorDeDois {

    public static void main(String[] args) {
        maiorDeDois(20,120);
    }

    public static void maiorDeDois(int num1, int num2) {

        if (num1 > num2){
            System.out.println(num1 + " é maior que " + num2);
        }else if(num2 > num1){
            System.out.println(num2 + " é maior que " + num1);
        }else{
            System.out.println("São iguais");
        }

    }
}
