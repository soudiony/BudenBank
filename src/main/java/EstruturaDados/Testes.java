package EstruturaDados;

import Contas.Conta;
import Contas.ContaPoupanca;
import Contas.Titular;

public class Testes {

    public static void main(String[] args) {
      //  int[] idade = new int[3];
//        idade[0] = 1;
//
//        for (int x = 0; x < idade.length; x++) {
//            System.out.println(idade[x]);
//        }
//
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

        GuardaContas guardaContas = new GuardaContas();
        guardaContas.add(cp1);
        guardaContas.add(cp2);
        guardaContas.add(cp3);

        int pos = guardaContas.getPosicao();
        System.out.println("Posicao: " + pos);


        for (int x = 0; x < pos; x++ ) {
            System.out.println("Nova Versao :"+ guardaContas.getContas(x));
        }

    }

}
