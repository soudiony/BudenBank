package Testando;

public class TestarConexao {
    public static void main(String[] args) {


        try (Conexao conex = new Conexao()) {

            conex.leDados();
        } catch (IllegalStateException err){
            System.out.println(".x.x...Deu erro na conexao..x.x..");
        }
    }
}

