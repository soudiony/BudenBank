package io_EntradaSaida;


import java.io.*;

public class TesteEscrita {
    public static void main(String[] args) throws IOException {

        OutputStream os = new FileOutputStream("log.txt");
        OutputStreamWriter wr = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(wr);


        bw.write("Arquivo criado por Dione");
        bw.write("data: 2/8/21");
        bw.close();



    }
}
