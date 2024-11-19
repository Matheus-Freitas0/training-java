package com.matheus.training_java.date;
import java.time.LocalDate;

public class RangeDate {

    public static void main(String[] args) {
        LocalDate inicio = LocalDate.of(2024, 11, 10);
        LocalDate fim = LocalDate.of(2024, 11, 20);
        LocalDate dataParaComparar = LocalDate.of(2024, 11, 15);

        boolean isWithinRange = (dataParaComparar.isAfter(inicio) || dataParaComparar.isEqual(inicio))
                && (dataParaComparar.isBefore(fim) || dataParaComparar.isEqual(fim));

        System.out.println("A data está no intervalo? " + isWithinRange);
    }
}
