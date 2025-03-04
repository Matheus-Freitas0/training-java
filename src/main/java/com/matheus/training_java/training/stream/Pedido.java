package com.matheus.training_java.training.stream;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Pedido {
    private Long id;
    private String cliente;
    private BigDecimal valorTotal;
    private LocalDate dataPedido;
    private StatusPedido status;
    private List<Produto> produtos;
}
