package Funcionarios;

import Funcionarios.Auxiliar;
import Funcionarios.Funcionario;
import Funcionarios.Gerente;

public class TestaFuncionario {

    public static void main(String[] args) {
     Administrador adm = new Administrador();
     adm.setNome("dionyy");
     adm.setCpf("2323");
     adm.setSalario(12345);
     adm.setSenha(2323);

        SistemaInterno si = new SistemaInterno();
        System.out.print("Administrador: ");
        si.confereAcesso(adm);

        Gerente  gv1 = new Gerente("Roney", "567", 5000);
        gv1.setSenha(3312);

        System.out.print("Gerente: ") ;
        si.confereAcesso(gv1);

    }
    }









   //     Funcionario gv2 = new Gerente("Reinaldo Borges", "1567", 7000);

   //     Funcionario aux = new Auxiliar("Gabriela", "0147", 2000);

   //     ControleBoni controle = new ControleBoni();


   //     System.out.println("Numeros de Bonificados: " + controle.getCont() + ", Total Boni: R$" + controle.getSoma());



