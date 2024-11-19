package com.matheus.training_java.date;
import java.time.LocalDate;
public class BeforeOfAfterDate {

        public static void main(String[] args) {
            LocalDate data1 = LocalDate.of(2024, 11, 10);
            LocalDate data2 = LocalDate.of(2024, 11, 15);

            // Verificar se data1 é anterior a data2
            boolean isBefore = data1.isBefore(data2);
            System.out.println("data1 é antes de data2? " + isBefore);

            // Verificar se data1 é posterior a data2
            boolean isAfter = data1.isAfter(data2);
            System.out.println("data1 é depois de data2? " + isAfter);

            // Verificar se são iguais
            boolean isEqual = data1.isEqual(data2);
            System.out.println("data1 é igual a data2? " + isEqual);
        }
    }


