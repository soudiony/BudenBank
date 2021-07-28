package EstruturaDados;

import Contas.Conta;

public class GuardaContas {

    private Object[] numContas;
    private int posicao;


    public GuardaContas() {
       this.numContas = new Object[10];
       this.posicao = 0;
      }

    public void add(Object obj) {
        numContas[this.posicao] = obj;
        posicao++;
    }

    public int getPosicao() {
        return this.posicao;
    }

    public Object getContas(int i) {
        return (numContas[i]);

    }
}
