package com.matheus.training_java.training.stream;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Funcionario {

    private Integer id;
    private String nome;
    private String telefone;
    private Integer idade;

}
