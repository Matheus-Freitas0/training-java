package com.matheus.training_java;

public class UseIfs {

    public static void main(String[] args) {
        var idade = 20;

        if (idade > 21){
            System.out.println("maior");
        } else if (idade == 21) {
            System.out.println("igual");
        }else {
            System.out.println("menor");
        }
    }
}
