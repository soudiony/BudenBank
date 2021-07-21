package Contas;

public class TestaConta {
    public static void main(String[] args) {

        Titular titular1 = new Titular();
        titular1.setNome("diony");

        Titular titular2 = new Titular();
        titular2.setNome("Lara Alves");


        ContaPoupanca cp2 = new ContaPoupanca(titular2, 141, 45785);
        ContaPoupanca cp1 = new ContaPoupanca(titular1,141, 32456);

        cp1.deposita(800);


        try  {
            cp1.transfere(1250, cp2);

        } catch (SaldoInsuficienteExepition ex) {
            System.out.println(ex.getMessage());
        }

        cp1.saca(21.32);


        //System.out.println("Valor Imposto: " + cc1.valores());

        //CauculaImpostos calc = new CauculaImpostos();
        //calc.valorImposto(cp1);
        //System.out.println("Valor Imposto 2: " + calc.getTotalPagoImposto());



      //  cp1.deposita(8500);
     //   cp1.transfere(3200, cc1, titular1);
    //    cp1.transfere(400, cc1, titular1);











    }
}