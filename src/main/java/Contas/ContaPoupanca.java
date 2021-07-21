package Contas;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Titular titular, int agencia, int numero) {
        super(titular, agencia, numero);
    }


    @Override
    public void transfere(double valor, Conta conta) {
        if (super.getSaldo() < valor) {
            //problema, joga a bomba!!
            throw new SaldoInsuficienteExepition("Transferencia não Realizada! Saldo Insuficiente, seu saldo é R$ " + this.getSaldo());
        }
        super.setSaldo(super.getSaldo() - valor);
        System.out.println("Transferencia no valor de R$ " + valor + " efetuado com sucesso, para a Ag: " + conta.getAgencia() + " | Conta: " + conta.getNumero() + " - Saldo Atual: R$ " + this.getSaldo());
    }


    @Override
    public void saca(double valor) {
        if (super.getSaldo() < valor) {
            //problema, joga a bomba!!
            throw new SaldoInsuficienteExepition("Saldo Insufucuemte, seu saldo é R$ " + this.getSaldo());
        }
        super.setSaldo(super.getSaldo() - valor);
        System.out.println("Saque no valor de R$ " + valor + " efetuado com sucesso!!!" + "Saldo Atual: R$ " + this.getSaldo());
    }
}

