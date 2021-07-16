package Funcionarios;

import Funcionarios.Auxiliar;
import Funcionarios.Funcionario;
import Funcionarios.Gerente;

public class TestaFuncionario {

    public static void main(String[] args) {

        Gerente  gv1 = new Gerente("Ronei Reis", "567", 5000);
        gv1.setSenha(3312);

        Administrador adm = new Administrador("Kiko", "010", 25000);
        adm.setSenha(21221);

        SistemaInterno si = new SistemaInterno();
        si.confereAcesso(gv1);
        si.confereAcesso(adm);


   //     Funcionario gv2 = new Gerente("Reinaldo Borges", "1567", 7000);

   //     Funcionario aux = new Auxiliar("Gabriela", "0147", 2000);

   //     ControleBoni controle = new ControleBoni();


   //     System.out.println("Numeros de Bonificados: " + controle.getCont() + ", Total Boni: R$" + controle.getSoma());


    }

}
