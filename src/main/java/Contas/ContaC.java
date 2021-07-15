package Contas;

public class ContaC extends Conta {

    private final double taxa = 3.50;
    public double getTaxa() {
        return taxa;
    }



    public ContaC(Cliente cliente, int agencia, int numero) {
        super(cliente, agencia, numero);
    }

    @Override
    public void transfere(int valor, Conta conta) {
        super.transfere(valor, conta);
    }

    public void transfere(int valor, Conta conta, Cliente cliente) {
        if (super.getSaldo() >= valor) {
            super.setSaldo(super.getSaldo() - valor - this.taxa);
            System.out.println("Transferencia Efetuada com sucesso.");
            System.out.println("Taxa Serviço PIX: " + this.taxa);


            System.out.println(cliente.getNome() + ", seu saldo! R$ " + super.getSaldo());

        } else System.out.println(super.getCliente()  + ", seu saldo é Insufuciente.");

    }
}
