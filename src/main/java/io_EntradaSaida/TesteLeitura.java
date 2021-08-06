package io_EntradaSaida;

import java.io.*;

public class TesteLeitura {
    public static void main(String[] args) throws IOException {
        FileInputStream fils = new FileInputStream("dados.txt");
        Reader isr = new InputStreamReader(fils, "UTF-8");
        BufferedReader br = new BufferedReader(isr);

        String linha = br.readLine();


        while (linha != null) {

            System.out.println(linha + "*****");
            linha = br.readLine();

        }
        br.close();
    }
}
