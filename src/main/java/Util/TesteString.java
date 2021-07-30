package Util;

import Clientes.Cliente;
import Contas.Conta;
import Contas.ContaCorrente;
import Contas.ContaPoupanca;
import Contas.Titular;

import java.util.ArrayList;
import java.util.List;

public class TesteString {

    public static void main(String[] args) {

        Titular titular1 = new Titular();
        titular1.setNome("Diony");

        Conta cc1 = new ContaCorrente(titular1, 22, 55);
        cc1.setCliente(titular1);
        cc1.deposita(550);


        Titular titular2 = new Titular();
        titular2.setNome("Lara");

        Conta cc2 = new ContaCorrente(titular2, 22, 33);
        cc2.setCliente(titular2);
        cc2.deposita(1550);


        Titular titular3 = new Titular();
        titular3.setNome("Tatiana");

        Conta cc3 = new ContaPoupanca(titular3, 22, 11);
        cc3.setCliente(titular3);
        cc3.deposita(860);

        Titular titular4 = new Titular();
        titular4.setNome("Marlena");

        Conta cc4 = new ContaPoupanca(titular4, 22, 44);
        cc4.setCliente(titular4);
        cc4.deposita(350);



        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        for (Conta conta : lista) {
            System.out.println(conta);
        }

        NumeroDaContaComparator numeroDaContaComparator = new NumeroDaContaComparator();

        ComparaNome comparaNome = new ComparaNome();
        comparaNome.compare(cc1, cc2);


        System.out.println("---------");

        for (Conta conta : lista) {
            System.out.println(conta);
        }

        lista.sort(numeroDaContaComparator);
        lista.sort(comparaNome);

        for (Conta conta : lista) {
            System.out.println(conta);
        }




    }


}

