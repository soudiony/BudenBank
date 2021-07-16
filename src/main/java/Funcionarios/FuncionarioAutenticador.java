package Funcionarios;

public abstract class FuncionarioAutenticador extends Funcionario{
    private int senha;


    public FuncionarioAutenticador(String nome, String cpf, double salario)
    {
        super(nome, cpf, salario);
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;

        } else {
            return false;
        }
    }


}
