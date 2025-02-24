package com.matheus.training_java.training.stream;

import java.util.ArrayList;
import java.util.Comparator;

public class Stream {

    public static void main(String[] args) {

        var funcionarios = new ArrayList<Funcionario>();
        funcionarios.add(new Funcionario(1, "João", "122212121", 25));
        funcionarios.add(new Funcionario(2, "Maria", "233323232", 30));
        funcionarios.add(new Funcionario(3, "Carlos", "344434343", 28));
        funcionarios.add(new Funcionario(4, "Ana", "455545454",22 ));
        funcionarios.add(new Funcionario(5, "Pedro", "566656565", 40));
        funcionarios.add(new Funcionario(6, "Mariana", "677767676", 22));
        funcionarios.add(new Funcionario(6, "Mariana", "677767676", 22));
        funcionarios.add(new Funcionario(7, "Rafael", "788878787", 27));
        funcionarios.add(new Funcionario(8, "Fernanda", "899989898", 33));
        funcionarios.add(new Funcionario(9, "Gustavo", "911119999", 26));
        funcionarios.add(new Funcionario(10, "Camila", "122221212", 29));

        funcionarios.stream()
                .sorted(Comparator.comparing(Funcionario::getNome))
                .limit(2)
                .forEach(System.out::println);
    }
}
