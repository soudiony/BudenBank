package Funcionarios;

public class SistemaInterno {

    private int senhaSistema = 3312;

     public void confereAcesso(Autenticador autenticador){
       boolean acessoConferido =  autenticador.autentica(this.senhaSistema);
        if (acessoConferido ) {
            System.out.println("Bem Vindo Ao Sistema");
        } else {
            System.out.println("Acesso Negado");
        }
    }

}
