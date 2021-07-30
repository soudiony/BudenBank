package Contas;

import java.util.Objects;


public abstract class Conta extends Object{
    private double saldo;
    private int agencia;
    private int numero;
    private Titular titular;

    private static int total = 0;


    public Conta(Titular titular, int agencia, int numero) {

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

//SaldoInsuficienteExepition.java

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

    public Titular getCliente() {
        return titular;
    }

    public void setCliente(Titular titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return Conta.total;
    }


    @Override
    public int hashCode() {
        return Objects.hash(agencia, numero);
    }

    @Override
    public boolean equals(Object obj) {
       Conta outra = (Conta) obj;  //cast

        if ((this.agencia == outra.agencia ) && (this.numero == outra.numero)) {
            return true;
        } else {
            return false;
        }
    }

    public abstract void transfere(double valor, Conta conta);

    public abstract void saca(double valor);

    @Override
    public String toString() {
        return " - saldo:  " + saldo +
                ", agencia:  " + agencia +
                ", numero:  " + numero +
                ", titular: " + titular.getNome();
    }
}