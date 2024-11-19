package com.matheus.training_java.standard;
import java.util.ArrayList;

public class ListsArray {

    public static void main(String[] args) {
        ArrayList<Integer> idades = new ArrayList<Integer>();
        idades.add(20);
        idades.add(30);
        idades.add(40);
        idades.add(50);
        idades.remove(0);
        idades.remove(2);
        System.out.println(idades);


    }
}
