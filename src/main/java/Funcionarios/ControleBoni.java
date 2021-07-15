package Funcionarios;

import Funcionarios.Funcionario;

public class ControleBoni {
    private double soma;
    private int cont =0;


    public void valorBonificacao(Funcionario funcionario){
        double registra = funcionario.bonificaoSalario();
        this.soma += registra;
        cont++;

    }

    public int getCont() {
        return cont;
    }

    public double getSoma() {

        return soma;
    }



}
