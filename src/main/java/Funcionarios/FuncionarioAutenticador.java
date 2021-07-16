package Funcionarios;

public abstract class FuncionarioAutenticador extends Funcionario{
    private int senha=3312;

    public FuncionarioAutenticador(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    public boolean autentica(int senhaDigitada) {
        if (this.senha == senhaDigitada) {
            return true;
        } else  {
            return false;
        }
    }
}
