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
    public void transfere(int valor, Conta conta, Titular titular) {
        if (super.getSaldo() >= valor) {
            super.setSaldo(super.getSaldo() - valor - this.taxa);
            System.out.println("Transferencia Efetuada com sucesso.");
            System.out.println("Taxa Serviço PIX: " + this.taxa);


            System.out.println(titular.getNome() + ", seu saldo! R$ " + super.getSaldo());

        } else System.out.println(super.getCliente() + ", seu saldo é Insufuciente.");

    }


    @Override
    public double valores() {
        return super.getSaldo() * 0.01 ;
    }
}

