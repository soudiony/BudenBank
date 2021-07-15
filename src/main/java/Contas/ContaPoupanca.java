package Contas;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente, int agencia, int numero)
    {
        super(cliente, agencia, numero);
    }


    @Override
    public void transfere(int valor, Conta conta, Cliente cliente) {
        if (this.getSaldo() >= valor) {
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Transferencia Efetuada com sucesso.");


            System.out.println("Saldo! R$ " + this.getSaldo());

        } else System.out.println("Saldo Insufuciente.");

    }
}
