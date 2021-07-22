package Enuns;

public class TestaEnus {
    public static void main(String[] args) {

        // Class Enum, nao instancia como as outras..
        Prioridades pMin = Prioridades.MIN;
        Prioridades pMax = Prioridades.MAX;
        Prioridades pMed = Prioridades.MED;

        System.out.println(pMin.getValor());
        System.out.println(pMed.getValor());
        System.out.println(pMax.getValor());

        System.out.println(pMax.ordinal());



        //Sem Enum
        Thread tr = new Thread();
        tr.setPriority(Thread.MAX_PRIORITY);
        tr.start();





    }
}
