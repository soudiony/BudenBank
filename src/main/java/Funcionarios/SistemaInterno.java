package Funcionarios;

public class SistemaInterno {

    private int senhaSistema = 3312;

     public void confereAcesso(Gerente gerente){
       boolean acessoConferido =  gerente.autentica(this.senhaSistema);
        if (acessoConferido ) {
            System.out.println("Bem Vindo Ao Sistema");
        } else {
            System.out.println("Acesso Negado");
        }
    }

    public void confereAcesso(Administrador administrador){
        boolean acessoConferido =  administrador.autentica(this.senhaSistema);
        if (acessoConferido ) {
            System.out.println("Bem Vindo Ao Sistema");
        } else {
            System.out.println("Acesso Negado");
        }
    }
}
