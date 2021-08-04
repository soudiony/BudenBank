package io_EntradaSaida;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteEntrada {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("contas.csv"));

        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            System.out.println(linha);

            Scanner linhaAlinha = new Scanner(linha);
            linhaAlinha.useLocale(Locale.ENGLISH);
            linhaAlinha.useDelimiter(",");

            String v1 = linhaAlinha.next();
            int v2 = linhaAlinha.nextInt();
            int v3 = linhaAlinha.nextInt();
            String v4 = linhaAlinha.next();
            double v5 = linhaAlinha.nextDouble();

            System.out.println(v1 + v2 + v3 + v4 + v5);


        }
        scanner.close();
    }
}
