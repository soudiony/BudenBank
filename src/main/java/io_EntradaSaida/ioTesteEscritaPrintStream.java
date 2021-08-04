package io_EntradaSaida;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class ioTesteEscritaPrintStream {
    public static void main(String[] args) throws IOException {

        PrintStream pr = new PrintStream("dados2.txt");
        pr.println("Arquivo GERADO/CRIADO por Dione Ribeiro - ");
        pr.println();
        pr.close();



    }
}
