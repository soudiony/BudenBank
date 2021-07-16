package Funcionarios;

public class Administrador extends Funcionario {
private int senha;

    public int getSenha() {
        return senha;

    }
    public boolean autentica(int senha){
        if (this.senha == senha){
            return true;

        } else {
            return false;
        }
    }

    @Override
    public double bonificaoSalario() {

        return this.getSalario() * 0.70;

    }
    public Administrador(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

}
