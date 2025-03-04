package com.matheus.training_java.training.stream;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Produto {

    private String nome;
    private BigDecimal preco;

}
