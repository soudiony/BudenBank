package Funcionarios;

public class Administrador extends Funcionario implements Autenticador {


   public Administrador(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

 @Override
 public double bonificaoSalario() {

 return this.getSalario() * 0.70;

   }
    private int senhas;

    @Override
    public void setSenha(int senha) {
        this.senhas = senha;

    }

    @Override
    public boolean autentica(int senha) {
        if (this.senhas == senha) {
            return true;
        } else {
            return false;

        }

         }
}
