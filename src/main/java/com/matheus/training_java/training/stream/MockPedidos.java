package com.matheus.training_java.training.stream;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

class MockPedidos {
    public static List<Pedido> gerarPedidos() {
        Produto p1 = new Produto("Notebook", new BigDecimal("3500.00"));
        Produto p2 = new Produto("Smartphone", new BigDecimal("2200.00"));
        Produto p3 = new Produto("Mouse Gamer", new BigDecimal("150.00"));
        Produto p4 = new Produto("Teclado Mecânico", new BigDecimal("450.00"));
        Produto p5 = new Produto("Monitor 27'", new BigDecimal("1200.00"));

        return Arrays.asList(
                new Pedido(1L, "Matheus", new BigDecimal("3500.00"), LocalDate.of(2024, 2, 10), StatusPedido.ENTREGUE, Arrays.asList(p1)),
                new Pedido(2L, "Ana", new BigDecimal("2350.00"), LocalDate.of(2024, 1, 15), StatusPedido.PENDENTE, Arrays.asList(p2, p3)),
                new Pedido(3L, "Carlos", new BigDecimal("1650.00"), LocalDate.of(2024, 1, 5), StatusPedido.CANCELADO, Arrays.asList(p3, p4)),
                new Pedido(4L, "Beatriz", new BigDecimal("1200.00"), LocalDate.of(2024, 3, 1), StatusPedido.ENTREGUE, List.of(p5)),
                new Pedido(5L, "Lucas", new BigDecimal("4100.00"), LocalDate.of(2024, 2, 20), StatusPedido.ENTREGUE, Arrays.asList(p1, p2)),
                new Pedido(6L, "Matheus", new BigDecimal("450.00"), LocalDate.of(2024, 2, 15), StatusPedido.CANCELADO, Arrays.asList(p4))
        );
    }
}
