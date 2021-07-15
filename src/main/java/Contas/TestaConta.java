package Contas;

public class TestaConta {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("diony");

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Lara");

        ContaP ContaPoupanca = new ContaP(cliente1, 141, 3426);
        ContaC conta = new ContaC(cliente,141, 32456);

        conta.deposita(8500);
        conta.transfere(3200, ContaPoupanca, cliente);







    }
}