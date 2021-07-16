package Funcionarios;

public class Administrador extends FuncionarioAutenticador {


    public Administrador(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public double bonificaoSalario() {

        return this.getSalario() * 0.70;

    }

}
