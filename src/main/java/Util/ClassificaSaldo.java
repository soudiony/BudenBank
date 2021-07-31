package Util;

import Contas.Conta;

import java.util.Comparator;

public class ClassificaSaldo implements Comparator<Conta> {


    @Override
    public int compare(Conta c1, Conta c2) {

        return Double.compare(c1.getSaldo(), c2.getSaldo());
    }
}
