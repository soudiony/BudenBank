public class ControleBoni {
    private double soma;
    private int cont =0;


    public void registra(Funcionario funcionario){
        double registra = funcionario.bonificaoSalario();
        this.soma += registra;
        cont++;

    }

    public int getCont() {
        return cont;
    }

    public double getSoma() {

        return soma;
    }



}
