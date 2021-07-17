package Funcionarios;

public class Gerente implements  Autenticador {

    private Funcionario funcionario;


    public Gerente(String nome, String id, int sal) {
    }

    public double bonificaoSalario() {
        double boniGerente = funcionario.getSalario()  * 0.5;
        return  boniGerente ;

    }

    public double salarioTotal(){
      // double total =  super.salario + boni;
      // return total;
       return this.bonificaoSalario() + funcionario.getSalario();

    }

    private int senhas;

    @Override
    public void setSenha(int senha) {
        this.senhas = senha;

    }



    @Override
    public boolean autentica(int senha) {
        if (this.senhas == senha){
            return true;

        }
            return false;
    }
}