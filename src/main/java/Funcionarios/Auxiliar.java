package Funcionarios;

import Funcionarios.Funcionario;

public class Auxiliar extends Funcionario {


    public Auxiliar(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public double bonificaoSalario() {
        return  super.getSalario() * 0.2;

    }
}
