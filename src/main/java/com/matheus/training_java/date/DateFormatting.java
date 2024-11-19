package com.matheus.training_java.date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting {

    public static void main(String[] args) {
        LocalDate dataAtual = LocalDate.now();

        // Formatar data em estilo padrão
        DateTimeFormatter formatterPadrao = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = dataAtual.format(formatterPadrao);
        System.out.println("Data formatada (dd/MM/yyyy): " + dataFormatada);

        // Converter string para LocalDate
        String dataEmTexto = "15/11/2024";
        LocalDate dataConvertida = LocalDate.parse(dataEmTexto, formatterPadrao);
        System.out.println("Data convertida de texto: " + dataConvertida);

        // Formatar em outro estilo
        DateTimeFormatter outroFormatter = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy");
        String outroFormato = dataAtual.format(outroFormatter);
        System.out.println("Data formatada (estilo diferente): " + outroFormato);
    }

}
