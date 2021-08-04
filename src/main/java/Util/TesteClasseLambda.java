package Util;

import Contas.Conta;
import Contas.ContaCorrente;
import Contas.ContaPoupanca;
import Contas.Titular;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class TesteClasseLambda {
    public static void main(String[] args) {


        Titular tit = new Titular();
        tit.setNome("diony");

        Conta cc1 = new ContaCorrente(tit, 56, 33);
        Conta cc2 = new ContaPoupanca(tit, 22, 44);
        Conta cc3 = new ContaCorrente(tit, 11, 11);
        Conta cc4 = new ContaPoupanca(tit, 23, 22);

        cc1.deposita(333.0);
        cc2.deposita(444.0);
        cc3.deposita(111.0);
        cc4.deposita(222.0);

        List<Conta> lista = new ArrayList<Conta>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);


        System.out.println("-----------sem ordenado");
        for (Conta conta : lista) {
            System.out.println(conta);
        }

        System.out.println("----------ordenado por Conta");
        lista.sort((c1, c2) -> Integer.compare(c1.getAgencia() * c1.getNumero(), c2.getNumero() * c2.getNumero()));

        lista.forEach((conta) -> System.out.println(conta ));


    }
}




        //    for (Conta c : lista) { System.out.println(c);}


//        System.out.println("----------ordenado por Nome");
//
//        Comparator<Conta> porNome = ((Conta c1, Conta c2) -> {
//            String comp1, comp2;
//
//            comp1 = c1.getCliente().getNome();
//            comp2 = c2.getCliente().getNome();
//            return comp1.compareTo(comp2);
//
//        });
//
//        lista.sort(porNome);
//
//        for (Conta c : lista) {
//            System.out.println(c);
//        }


