package com.matheus.training_java.training.stream;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;


public class Stream {

    public static void main(String[] args) {
        List<Pedido> pedidos = MockPedidos.gerarPedidos();


//        var pedidosFiltrados = pedidos.stream()
//                .filter(pedido -> pedido.getStatus() == StatusPedido.ENTREGUE)
//                .map(Pedido::getValorTotal)
//                .reduce(BigDecimal.ZERO, BigDecimal::add);
//
//        System.out.println(pedidosFiltrados);
//
//        IntSummaryStatistics stats = pedidos.stream()
//                .filter(pedido -> pedido.getStatus() == StatusPedido.ENTREGUE)
//                .collect(Collectors.summarizingInt(p -> p.getValorTotal().intValue()));
//
//        System.out.println("Estatísticas: " + stats);

//        var pedidosOrganizados = pedidos.stream()
//                .sorted(Comparator.comparing(Pedido::getValorTotal).reversed())
//                .toList();
//
//        System.out.println(pedidosOrganizados);

//            var pedidosAgrupados = pedidos.stream()
//                    .collect(Collectors.groupingBy(Pedido::getStatus));
//        System.out.println(pedidosAgrupados);

/*        Map<Long, Pedido> pedidoMap = pedidos.stream()
                .collect(Collectors.toMap(Pedido::getId, p -> p));
        System.out.println(pedidoMap.get(2L));
        System.out.println("Map de Pedidos: " + pedidoMap);*/

//        var pedidoMaisCaro = pedidos.stream()
//                                    .flatMap(pedido -> pedido.getProdutos().stream())
//                .max(Comparator.comparing(Produto::getPreco));
//        System.out.println(pedidoMaisCaro);

//        Map<String, Long> NomeEpedidos = pedidos.stream()
//                .collect(Collectors.groupingBy(Pedido::getCliente, Collectors.counting() ));
//        System.out.println(NomeEpedidos);

//        var maiorData = pedidos.stream()
//                .max(Comparator.comparing(Pedido::getDataPedido));
//        System.out.println(maiorData);


//        var listaProdutosUnicos = pedidos.stream()
//                .flatMap(pedido -> pedido.getProdutos().stream())
//                .distinct()
//                .toList();
//
//        System.out.println(listaProdutosUnicos);

//        var produtosMenos500 = pedidos.stream()
//                .flatMap(pedido -> pedido.getProdutos().stream())
//                .filter(produto -> produto.getPreco().doubleValue() < 500)
//                .distinct()
//                .toList();
//
//        System.out.println(produtosMenos500);
/*
        var intSummaryStatistics = pedidos.stream()
                .flatMap(pedido -> pedido.getProdutos().stream())
                .collect(Collectors.averagingInt(pedido -> pedido.getPreco().intValue()));

        System.out.println(intSummaryStatistics);*/

/*        Map<String, List<Produto>> mapDeClienteEPedido = pedidos.stream()
                .collect(Collectors.groupingBy(Pedido::getCliente, Collectors.flatMapping(pedido -> pedido.getProdutos().stream(), Collectors.toList())));
        System.out.println(mapDeClienteEPedido);*/

/*        var totalMaiorQue10K = pedidos.stream()
                .filter(pedido -> pedido.getValorTotal().intValue() > 10000)
                .toList();
        System.out.println(totalMaiorQue10K);*/

/*        var pedidosPorData = pedidos.stream()
                .sorted(Comparator.comparing(Pedido::getDataPedido).reversed())
                .toList();
        System.out.println(pedidosPorData);*/

//        var maisBaratoDoPedido = pedidos.stream()
//                .collect(Collectors.groupingBy(Pedido::getId, Collectors.flatMapping(pedido -> pedido.getProdutos().stream(), Collectors.minBy(Comparator.comparing(Produto::getPreco))))
//                );
//        System.out.println(maisBaratoDoPedido);

//        var valorTotalPorStatus = pedidos. stream()
//                .collect(Collectors.groupingBy(Pedido::getStatus, Collectors.summingInt(pedido -> pedido.getValorTotal().intValue()) ));
//        System.out.println(valorTotalPorStatus);
/*
        var produtoMaisCaroCliente = pedidos.stream()
                .collect(Collectors.groupingBy(Pedido::getCliente, Collectors.flatMapping(pedido -> pedido.getProdutos().stream(), Collectors.maxBy(Comparator.comparing(Produto::getPreco)))));
        System.out.println(produtoMaisCaroCliente);*/

//        var totalProdutosVendidos = pedidos.stream()
//                .flatMap(pedido -> pedido.getProdutos().stream())
//                .collect(Collectors.groupingBy(Produto::getNome, Collectors.summingInt(pedido -> pedido.getPreco().intValue())));
//        System.out.println(totalProdutosVendidos);

        var produtosComUmAcimaDe1000 = pedidos.stream()
                        .filter(pedido -> pedido.getProdutos().stream()
                        .anyMatch(produto -> produto.getPreco().intValue() > 1000)).toList();
        System.out.println(produtosComUmAcimaDe1000);
    }

}
