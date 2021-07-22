package Contas;

public class SaldoInsuficienteExepition extends RuntimeException{

    public SaldoInsuficienteExepition(String message)
    {
        super(message);
    }
}
