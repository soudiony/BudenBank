package Funcionarios;

import Autenticacao.AutenticaoSistema;

public class Gerente extends Funcionario implements Autenticador {

    private AutenticaoSistema autenticaoSistema;


    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);

    }


    public Gerente() {
        autenticaoSistema = new AutenticaoSistema();

    }

    public double bonificaoSalario() {
        double boniGerente = this.getSalario() * 0.5;
        return boniGerente;

    }

    public double salarioTotal() {
        return this.bonificaoSalario() + this.getSalario();

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

        }
        return false;
    }
}