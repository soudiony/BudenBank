public class TesteMain {
    public static void main(String[] args) {
        FuncionarioMais diony = new FuncionarioMais("diony", "0444", 25000, 1);

                System.out.println("Nome: " + diony.getNome() +
                                    " | CPF: " + diony.getCpf() +
                                    " | Salário: " + diony.getSalario() +
                                    " | Adicionar ao Salário R$ " + diony.bonificaoSalario());

    }
}
