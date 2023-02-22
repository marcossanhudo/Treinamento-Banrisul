package pilarAbstracao;

public class Carro {
    String marca;
    boolean ligado = false;
    private boolean sistemaEletricoPronto = false;
    private boolean sistemaArPronto = false;
    private boolean sistemaFrenagemPronto = false;
    
    public Carro(String marca) {
        this.marca = marca;
    }
    
    public void ligar() {
        this.ligado = acionarMotorACombustao();
        this.sistemaEletricoPronto = this.ligado;
        this.sistemaArPronto = this.ligado;
        this.sistemaFrenagemPronto = this.ligado;
    }
    
    private boolean acionarMotorACombustao() {
        boolean sucesso = true;
        
        sucesso = executarTempo1();
        if (sucesso == false) return false;
        
        sucesso = executarTempo2();
        if (sucesso == false) return false;
        
        sucesso = executarTempo3();
        if (sucesso == false) return false;
        
        sucesso = executarTempo4();
        if (sucesso == false) return false;
        
        return sucesso;
    }
    
    public boolean executarTempo1() { return true; }
    public boolean executarTempo2() { return true; }
    public boolean executarTempo3() { return true; }
    public boolean executarTempo4() { return true; }
}
