package Funcionarios;

import Autenticacao.AutenticaoSistema;

public class Administrador extends Funcionario implements Autenticador {

    private AutenticaoSistema autenticaoSistema;

    public Administrador() {
        autenticaoSistema = new AutenticaoSistema();
    }


    @Override
    public double bonificaoSalario() {

        return this.getSalario() * 0.70;

    }

    @Override
    public void setSenha(int senha) {
        this.autenticaoSistema.setSenha(senha) ;

    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticaoSistema.autentica(senha);

    }

}
