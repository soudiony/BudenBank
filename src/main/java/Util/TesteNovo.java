package Util;

import Contas.Conta;
import Contas.ContaPoupanca;
import Contas.Titular;

import java.util.ArrayList;

public class TesteNovo {
    public static void main(String[] args) {
        ArrayList<Conta> list = new ArrayList<Conta>();

        Titular titular = new Titular();
        titular.setNome("diony");

        Conta c1 = new ContaPoupanca(titular, 12, 1234);
        list.add(c1);

        Conta c2 = new ContaPoupanca(titular, 123, 2134);
        list.add(c2);

        Conta c3 = new ContaPoupanca(titular, 123, 2134);
        boolean ig = list.contains(c2);

        System.out.println("sao Iguais? "+ ig);



        for (Conta conta : list){
            if (conta.equals(c2))

            System.out.println("Conta já Existe" );
        }


    }
}
