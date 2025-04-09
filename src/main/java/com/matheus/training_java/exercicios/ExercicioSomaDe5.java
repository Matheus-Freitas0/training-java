package com.matheus.training_java.exercicios;

import java.util.Arrays;
import java.util.List;

public class ExercicioSomaDe5 {

    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(10,20,3,7,8,12);
        somaDe5(lista);
    }

    public static void somaDe5(List<Integer> listaNumeros) {
        int total = 0;
        for (int i = 0; i < listaNumeros.size(); i++) {
            total += listaNumeros.get(i);
        }
        System.out.println("O total é "+ total);
    }


}
