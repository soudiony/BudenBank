public class Referencias {

    public static void main(String[] args) {

        Funcionario gv1 = new Gerente("Ronei Reis", "567", 5000);
        Gerente gv2 = new Gerente("Reinaldo Borges", "1567", 7000);
        Funcionario func = new Funcionario("Karina", "13563", 4000);

        Auxiliar aux = new Auxiliar("Gabriela", "0147", 2000);

        ControleBoni controle =
                new ControleBoni();

        controle.registra(func);
        controle.registra(gv1);
        controle.registra(gv2);
        controle.registra(aux);

        System.out.println("Numeros de Bonificados: " + controle.getCont() + ", Total Boni: R$" + controle.getSoma());


    }

}
