package Contas;

public class TestaConta {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("diony");

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Lara");

        ContaPoupanca cp1 = new ContaPoupanca(cliente1, 141, 3426);
        ContaCorrente cc1 = new ContaCorrente(cliente,141, 32456);

        cp1.deposita(8500);
        cp1.transfere(3200, cc1, cliente1);
        cp1.transfere(400, cc1, cliente1);








    }
}