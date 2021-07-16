package Funcionarios;

public class Gerente extends FuncionarioAutenticador{

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