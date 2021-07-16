package Funcionarios;

public class SistemaInterno {

    private int senhaSistema = 3312;

     public void confereAcesso(FuncionarioAutenticador funcionarioAutenticador){
       boolean acessoConferido =  funcionarioAutenticador.autentica(this.senhaSistema);
        if (acessoConferido ) {
            System.out.println("Bem Vindo Ao Sistema");
        } else
            System.out.println("Acesso Negado");

    }
}
