package Funcionarios;

import Funcionarios.Auxiliar;
import Funcionarios.Funcionario;
import Funcionarios.Gerente;

public class TestaFuncionario {

    public static void main(String[] args) {

        Gerente gv1 = new Gerente("Ronei Reis", "567", 5000);
        Funcionario gv2 = new Gerente("Reinaldo Borges", "1567", 7000);

        Funcionario aux = new Auxiliar("Gabriela", "0147", 2000);

        ControleBoni controle = new ControleBoni();

        gv1.bonificaoSalario();
        gv2.bonificaoSalario();
        aux.bonificaoSalario();


        // valores de Bonificação
        controle.valorBonificacao(gv1);
        controle.valorBonificacao(gv2);
        controle.valorBonificacao(aux);


        System.out.println("Numeros de Bonificados: " + controle.getCont() + ", Total Boni: R$" + controle.getSoma());


    }

}
