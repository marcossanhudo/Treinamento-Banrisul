package exercicios.exercicioExtra1;

public class ContaCorrente extends Conta {
    private double limiteChequeEspecial = 0;
    
    public ContaCorrente(String id) {
        super(id);
    }
    public ContaCorrente(String id, double depositoInicial) {
        super(id, depositoInicial);
    }
    
    @Override
    public boolean depositar(double quantia) {
        this.saldo += quantia;
        atualizarLimiteChequeEspecial();
        return true;
    }
    
    @Override
    public double sacar(double quantia) {
        return sacar(quantia, false);
    }
    public double sacar(double quantia, boolean usarChequeEspecial) {
        if (quantia > saldo)
            if (quantia > limiteChequeEspecial)
                if (usarChequeEspecial) quantia = saldo + limiteChequeEspecial;
                else quantia = saldo + (limiteChequeEspecial - (quantia - saldo));
            else quantia = saldo;
        saldo -= quantia;
        atualizarLimiteChequeEspecial();
        return quantia;
    }
    
    private void atualizarLimiteChequeEspecial() {
        limiteChequeEspecial = saldo * 0.05;
    }
    
    public double verificarLimiteChequeEspecial() {
        return this.limiteChequeEspecial;
    }
}
