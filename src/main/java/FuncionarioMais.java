public class FuncionarioMais {

    private String nome;
    private String cpf;
    private double salario;
    private int tipo = 0; //0: Comum, 1: Gerente, 2: Diretoria

    public FuncionarioMais(String nome, String cpf, double salario, int tipo) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
         this.tipo = tipo;

    }

    public double bonificaoSalario() {
        if (this.tipo == 0) {
            return this.salario * 0.10;

        } else if (this.tipo == 1) {
            return this.salario * 0.30;

        } else if (this.tipo == 2) {
            return this.salario * 0.50;
        }
        return this.salario;

    }

//get e Set ----- Inicio
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
//get e Set ----- Fim



}
