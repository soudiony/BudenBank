package Contas;

public class ContaCorrente extends Conta implements Tributos{

    private final double taxa = 3.50;


    public double getTaxa() {
        return taxa;
    }


    public ContaCorrente(Titular titular, int agencia, int numero) {
        super(titular, agencia, numero);
    }

    @Override
    public void transfere(double valor, Conta conta) {

    }

    @Override
    public void saca(double valor) {

    }

    @Override
    public double valores() {
        return super.getSaldo() * 0.01 ;
    }

    @Override
    public String toString() {
        return "Conta Corrente" + super.toString();
    }
    }

