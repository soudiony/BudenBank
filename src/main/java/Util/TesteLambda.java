package Util;

import Contas.Conta;
import Contas.ContaCorrente;
import Contas.ContaPoupanca;
import Contas.Titular;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteLambda {
    public static void main(String[] args) {


        Titular tit = new Titular();
        tit.setNome("diony");

        Conta cc1 = new ContaCorrente(tit, 56, 33);
        //    cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(tit, 22, 44);
        //    cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(tit, 11, 11);
        //  cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(tit, 23, 22);
        //  cc4.deposita(222.0);

        List<Conta> lista = new ArrayList<Conta>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        ClassificarContas classificarContas = new ClassificarContas();
        System.out.println("-----------sem ordenado");
        for (Conta c : lista) {
            System.out.println(c);
        }

        lista.sort(classificarContas);

        System.out.println("----------ordenado");
        for (Conta c : lista) {
            System.out.println(c);
        }
    }

}

class ClassificarContas implements Comparator<Conta> {

    @Override
    public int compare(Conta conta1, Conta conta2) {
        int c3, c4;
        c3 = conta1.getAgencia() * conta1.getNumero();

        c4 = conta2.getNumero() * conta2.getNumero();


        if (c3 < c4) {
            return -1;
        }
        if (c3 > c4) {
            return 1;
        }
        return 0;
    }
}

