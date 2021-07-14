public class Referencias {

    public static void main(String[] args) {
        Gerente gv1 = new Gerente("Ronei Reis", "567", 5000);
        ControleBoni boni1 = new ControleBoni();
        boni1.registraGV(gv1);
        System.out.println(boni1.getSoma());

        Gerente gv2 = new Gerente("Reinaldo Borges", "1567", 6700);
        ControleBoni boni2 = new ControleBoni();
        boni2.registraGV(gv2);
        System.out.println(boni2.getSoma());

        Funcionario func = new Funcionario("Karina", "13563", 4300);
        ControleBoni func1 = new ControleBoni();
        func1.registraFunc(func);
        System.out.println(func1.getSoma());







    }

}
