package Util;

import Contas.Conta;
import Contas.ContaPoupanca;
import Contas.Titular;
import Testando.Conexao;

import java.util.ArrayList;

public class TesteUtil {
    public static void main(String[] args) {
        ArrayList<Conta> list = new ArrayList<Conta>();

        Titular titular = new Titular();
        titular.setNome("diony");

        Conta c1 = new ContaPoupanca(titular, 12, 1234);
        list.add(c1);

        Conta c2 = new ContaPoupanca(titular, 123, 2134);
        list.add(c2);

        Conta c3 = new ContaPoupanca(titular, 123, 2134);


        list.remove(0);

       // System.out.println("criado: " + list.size());
     //   for (int x = 0; x < list.size(); x++){
     //       System.out.println(x+1 + "º Conta - "+ list.get(x));
    //    }

        for (Conta x : list){
            System.out.println(x);
        }


    }
}
