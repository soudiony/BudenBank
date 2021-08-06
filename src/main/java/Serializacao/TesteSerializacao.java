package Serializacao;

import java.io.*;

public class TesteSerializacao {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String nome = "Diony Ribeiro";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("saida.bin"));
        oos.writeObject(nome);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("saida.bin"));
        String nomes = (String) ois.readObject();
        System.out.println(nomes);
        ois.close();



    }
}
