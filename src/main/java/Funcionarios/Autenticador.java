package Funcionarios;

public abstract interface Autenticador {
    //SetSenha e Autentica, devem ser obrigatoriamente implementados

    public abstract  void setSenha(int senha);

    public abstract boolean autentica(int senha);


}
