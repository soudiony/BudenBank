public class TesteMain {
    public static void main(String[] args) {
        Funcionario diony = new Funcionario("diony", "0444", 5551);

                System.out.println("Nome: " + diony.getNome() +
                                    " | CPF: " + diony.getCpf() +
                                    " | Salário: " + diony.getSalario() +
                                    " | Adicionar ao Salário R$ " + diony.bonificaoSalario());


    Gerente gerente = new Gerente("Ronei Reis", "567", 5900);
    gerente.setSenha(1268);
    gerente.senhaGerente(1268);

    System.out.println("Boni Gerente: " + gerente.bonificaoSalario());
    System.out.println("Salário Total Gerente: " + gerente.salarioTotal());


    }
}
