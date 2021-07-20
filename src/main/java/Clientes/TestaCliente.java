package Clientes;

import Funcionarios.SistemaInterno;

public class TestaCliente {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.setSenha(33123);

        SistemaInterno s1 = new SistemaInterno();
        System.out.print("Cliente: ") ;
        s1.confereAcesso(cliente1);

    }
}
