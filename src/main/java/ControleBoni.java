public class ControleBoni {
    private double soma;

    public void registraGV(Gerente gerente){
        double registra = gerente.bonificaoSalario();
        this.soma += registra;

    }
    public void registraFunc(Funcionario funcionario){
        double registra = funcionario.bonificaoSalario();
        this.soma += registra;

    }


    public double getSoma() {
        return soma;
    }
}
