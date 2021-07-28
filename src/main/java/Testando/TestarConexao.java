package Testando;

import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class TestarConexao {
    public static void main(String[] args) {

        System.out.println("Digite se Nome: ");
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine().toUpperCase();



        String rec = nome.toUpperCase();

        System.out.println(nome);
        System.out.println(rec);

        try (Conexao conex = new Conexao()) {

            conex.leDados();
        } catch (IllegalStateException err){
            System.out.println(".x.x...Deu erro na conexao..x.x..");
        }
    }
}

