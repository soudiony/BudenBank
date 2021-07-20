package Clientes;

import Autenticacao.AutenticaoSistema;
import Funcionarios.Autenticador;

public class Cliente implements Autenticador {

    private AutenticaoSistema autenticaoSistema;

    public Cliente(){
        this.autenticaoSistema = new AutenticaoSistema();

}
    @Override
    public void setSenha(int senha) {
        this.autenticaoSistema.setSenha(senha);

    }

    @Override
    public boolean autentica(int senha) {
       return this.autenticaoSistema.autentica(senha);
    }


}
