package Contas;

public abstract class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente cliente;

    private static int total = 0;




    public Conta(Cliente cliente, int agencia, int numero) {

        Conta.total++;

        this.agencia = agencia;
        this.numero = numero;

        System.out.println(Conta.total + " Conta Criada: Ag: " + this.agencia + " Num: " + this.numero);
    }



    public void deposita(double valor) {
        this.saldo = this.saldo + valor;
        System.out.println("Depositor Efetuado com Sucesso.");
        System.out.println("Saldo: R$ " + this.saldo);
    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque Efetuado com sucesso.");
            return true;
        } else {
            System.out.println("Saldo Insufuciente.");
            return false;
        }
    }


    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.agencia = agencia;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public static int getTotal()
    {
        return Conta.total;
    }

    public abstract void transfere(int valor, Conta conta, Cliente cliente);

}