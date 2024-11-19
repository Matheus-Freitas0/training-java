package com.matheus.training_java.date;
import java.time.LocalDate;
import java.time.Period;

public class DifferenceDate {

    public static void main(String[] args) {
        LocalDate data1 = LocalDate.of(2024, 11, 10);
        LocalDate data2 = LocalDate.of(2025, 11, 10);

        Period periodo = Period.between(data1, data2);
        System.out.println("Diferença: " + periodo.getYears() + " anos, " + periodo.getMonths() + " meses, " + periodo.getDays() + " dias.");
    }

}
