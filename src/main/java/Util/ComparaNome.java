package Util;

import Contas.Conta;

import java.util.Comparator;

public class ComparaNome implements Comparator<Conta> {


    @Override
    public int compare(Conta c1, Conta c2) {
        String c3, c4;
        c3 = c1.getCliente().getNome();
        c4 = c2.getCliente().getNome();

        return c3.compareTo(c4);
    }
}
