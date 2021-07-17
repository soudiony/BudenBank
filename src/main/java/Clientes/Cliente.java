package Clientes;

import Funcionarios.Autenticador;

public class Cliente implements Autenticador {

    private int senhas;

    @Override
    public void setSenha(int senha) {
        this.senhas = senha;

    }

    @Override
    public boolean autentica(int senha) {
        if (this.senhas == senha){
            return true;
        } else {
            return false;
        }
    }
}
