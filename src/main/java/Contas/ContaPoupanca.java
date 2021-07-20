package Contas;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Titular titular, int agencia, int numero)
    {
        super(titular, agencia, numero);
    }


    @Override
    public void transfere(int valor, Conta conta, Titular titular) {
        if (this.getSaldo() >= valor) {
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Transferencia Efetuada com sucesso.");


            System.out.println("Saldo! R$ " + this.getSaldo());

        } else System.out.println("Saldo Insufuciente.");

    }
}
