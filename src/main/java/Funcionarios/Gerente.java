package Funcionarios;

public class Gerente extends Funcionario {

    private Funcionario funcionario;

    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getSenha() {
        return senha;

    }
    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;

        } else {
            return false;
        }
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

    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }


}