package io_EntradaSaida;

import java.io.*;

public class TesteLeitura {
    public static void main(String[] args) throws IOException {
        FileInputStream fils = new FileInputStream("dados.txt");
        InputStreamReader isr = new InputStreamReader(fils);
        BufferedReader br = new BufferedReader(isr);

        String linha = br.readLine();
        br.close();

        while (linha != null) {

            System.out.println(linha + "*****");
            linha = br.readLine();

        }

    }
}
