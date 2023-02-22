package exercicios.exercicioExtra1;

public class Conta {
    protected String id;
    protected double saldo = 0;

    public Conta(String id) {
        this.id = id;
    }
    public Conta(String id, double depositoInicial) {
        this(id);
        this.saldo += depositoInicial;
    }
    
    public double extrato() {
        return this.saldo;
    }
    
    public boolean depositar(double quantia) {
        saldo += quantia;
        return true;
    }
    
    public double sacar(double quantia) {
        if (quantia > saldo) quantia = saldo;
        saldo -= quantia;
        return quantia;
    }
}
