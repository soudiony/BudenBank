package Contas;

public abstract class Conta {
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

    public boolean saca(double valor) {


          try {
              if (this.saldo >= valor) {
                  this.saldo -= valor;

                  System.out.println("Saque Efetuado com sucesso.");
                  return true;
              }
          }catch (ArithmeticException ex) {
            ex.getMessage();



        }
        System.out.println("Sem Grana.");
        return false;
    }

   // public void saca(double valor) {
   //     try {
  //          verificaSaldo(valor);

   //     } catch (ArithmeticException err) {
   //         String erro = err.getMessage();
   //         System.out.println(erro);
   //         err.printStackTrace();

//        }

        //}



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

    public static int getTotal()
    {
        return Conta.total;
    }

    public abstract void transfere(int valor, Conta conta, Titular titular);

}