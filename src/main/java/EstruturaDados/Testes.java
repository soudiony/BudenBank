package EstruturaDados;

public class Testes {

    public static void main(String[] args) {
        int[] idade = new int[3];
        idade[0] = 1;
        idade[1] = 2;
        idade[2] = 3;


        for (int x = 0; x < idade.length; x++) {

            System.out.println(idade[x]);
        }


        try {


            System.out.println( "O Campo nao esta vazio - " + idade[8]);

        } catch (ArrayIndexOutOfBoundsException err) {

          System.out.println(" ** Execeção ao acesar campo nulo **");
          err.getMessage();

        }
        System.out.println("O programa chegou ao fim");
    }

}
