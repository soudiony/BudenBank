package Util;

import Contas.Conta;
import Contas.ContaPoupanca;
import Contas.Titular;
import Testando.Conexao;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TesteUtil {
    public static void main(String[] args) {
        List<Conta> list = new ArrayList<Conta>();
        List<Conta> listas= new LinkedList<>() ;


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

        Integer vari = Integer.valueOf("13");
        System.out.println("***"+ vari);

        int vari1 = Integer.parseInt("13");
        System.out.println("***"+ vari1);


        //int num = Integer.parseInt("10");
        //double num = Double.parseDouble("10");
        String s = args[0];


        System.out.println("ORGANOGRAMA: " + s);
        System.out.println("PLANO DE AÇÃO: " + s);
        System.out.println("CHAMADADOS: " + s);
        System.out.println("BEES: " + s);
        System.out.println("PORTARIA: " + s);




    }
}
