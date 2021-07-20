package Contas;

public class CauculaImpostos {

    private double totalPagoImposto;

    public void valorImposto(Tributos tributos){
        double val = tributos.valores();
        this.totalPagoImposto += val;
    }

    public double getTotalPagoImposto() {
        return totalPagoImposto;
    }

}
