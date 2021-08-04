package io_EntradaSaida;


import java.io.*;

public class TesteEscritaFileWriter {
    public static void main(String[] args) throws IOException {

    //    FileWriter fw = new FileWriter("dados.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter("dados.txt"));

        bw.write("Arquivo criado por Dione Ribeiro - ");
        bw.write(System.lineSeparator());
        bw.write("date 3/8/21");
        bw.close();

    }
}
