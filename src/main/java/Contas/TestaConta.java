package Contas;

public class TestaConta {
    public static void main(String[] args) {

        Titular titular = new Titular();
        titular.setNome("diony");

    //    Titular titular1 = new Titular();
    //    titular1.setNome("Lara");

     //   ContaPoupanca cp1 = new ContaPoupanca(titular1, 141, 3426);
        ContaCorrente cc1 = new ContaCorrente(titular,141, 32456);
        cc1.deposita(800);

        cc1.saca(12000);

        System.out.println("Valor Imposto: " + cc1.valores());

        CauculaImpostos calc = new CauculaImpostos();
        calc.valorImposto(cc1);
        System.out.println("Valor Imposto 2: " + calc.getTotalPagoImposto());



      //  cp1.deposita(8500);
     //   cp1.transfere(3200, cc1, titular1);
    //    cp1.transfere(400, cc1, titular1);











    }
}