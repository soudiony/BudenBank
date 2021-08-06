package Serializacao;

import Clientes.Cliente;
import Contas.Titular;

import java.io.*;

public class TesteSerializacaoCliente {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Titular titular = new Titular();
        titular.setNome("Lara Alves Ribeiro");



        //String nome = "Diony Ribeiro";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("saida.bin"));
        oos.writeObject(titular);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("saida.bin"));
        Titular nomes = (Titular) ois.readObject();
        System.out.println(titular.getNome());
        ois.close();



    }
}
