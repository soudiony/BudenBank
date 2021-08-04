package io_EntradaSaida;

import java.io.*;

public class InOut {
    public static void main(String[] args) throws IOException {


    //ENTRAFA
    FileInputStream fils = new FileInputStream("dados.txt");
    Reader isr = new InputStreamReader(fils);
    BufferedReader br = new BufferedReader(isr);

    String linha = br.readLine();


    //SAIDA
    OutputStream os = new FileOutputStream("log.txt");
    OutputStreamWriter wr = new OutputStreamWriter(os);
    BufferedWriter bw = new BufferedWriter(wr);

    while (linha != null) {
            bw.write(linha + " - log Diony");
            bw.newLine();

            linha = br.readLine();
       }
             br.close();
            bw.close();
    }

}
