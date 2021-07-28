package EstruturaDados;

import Contas.Conta;
import Contas.ContaPoupanca;
import Contas.Titular;

import java.util.ArrayList;

public class Testes {

    public static void main(String[] args) {

//        try {
//            System.out.println( "O Campo nao esta vazio - " + idade[8]);
//        } catch (ArrayIndexOutOfBoundsException err) {
//
//          System.out.println(" ** Execeção ao acesar campo nulo **");
//          err.getMessage();
//        }
//              System.out.println("O programa chegou ao fim");


        Titular titular1 = new Titular();

        Conta cp1 = new ContaPoupanca(titular1, 12, 123);
        Conta cp2 = new ContaPoupanca(titular1, 132, 3123);
        Conta cp3 = new ContaPoupanca(titular1, 1232, 234123);
        Conta cp4 = new ContaPoupanca(titular1, 12, 123);

        ArrayList<Conta> list = new ArrayList<Conta>();

        //if (list.contains(cp1)){
        //    System.out.println("A Conta ja Existe!");
       // } else


        list.add(cp1);
        list.add(cp2);
        list.add(cp3);

        System.out.println("CONTEM - Esta conta ja contém no BD? "+ list.contains(cp1));
        System.out.println("EQUAL -  Esta conta ja contém no BD? "+ cp1.equals(cp4));


      // try {
        //   boolean retornoConta = list.contains(cp2);
        //   System.out.println(retornoConta);
//
    //    } catch (Erros err){

    //   };


        for (Conta c:list){
            System.out.println(c);
        }


    }

}
