package Enuns;

public enum Prioridades {
    MIN(10),MED(20), MAX(30);



    private int valor;

    Prioridades(int i) {
        this.valor = i;
    }

    public int getValor() {
        return valor;
    }
}
