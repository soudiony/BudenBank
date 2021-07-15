package Funcionarios;

import Funcionarios.Funcionario;

public class Gerente extends Funcionario {

    private Funcionario funcionario;
    private int senha;

    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean senhaGerente(int senhaDigitada){
        if (this.senha == senhaDigitada) {

            System.out.println("Bem Vindo " + this.getNome());
            return true;

        }  else
            System.out.println("Senha Inválida");
            return false;

        }


    public double bonificaoSalario() {
        double boniGerente = this.getSalario() * 0.5;
        return  boniGerente ;

    }

    public double salarioTotal(){
      // double total =  super.salario + boni;
      // return total;
       return this.bonificaoSalario() + super.getSalario();

    }
}