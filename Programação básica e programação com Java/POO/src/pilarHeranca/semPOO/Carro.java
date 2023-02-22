package pilarHeranca.semPOO;

public class Carro {
    private String marca;
    private int tipo;
    private boolean ligado = false;
    private boolean sistemaEletricoPronto = false;
    private boolean sistemaArPronto = false;
    private boolean sistemaFrenagemPronto = false;
    
    public Carro(String marca, int tipo) {
        this.marca = marca;
        this.tipo = tipo;
    }
    
    private void ligar() {
        if (this.tipo == 1) this.ligado = acionarMotorACombustao();
        if (this.tipo == 2) this.ligado = acionarBateriaParaMotorEletrico();
        this.sistemaEletricoPronto = this.ligado;
        this.sistemaArPronto = this.ligado;
        this.sistemaFrenagemPronto = this.ligado;
    }
    
    public void setLigado(boolean ligado) {
        if (ligado == true) this.ligar();
        if (ligado == false) {
            sistemaEletricoPronto = false;
            sistemaArPronto = false;
            sistemaFrenagemPronto = false;
        }
        this.ligado = ligado;
    }
    
    public boolean getLigado() {
        return this.ligado;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getMarca() {
        return this.marca;
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
    
    private boolean acionarBateriaParaMotorEletrico() {
        boolean sucesso = true;
        return sucesso;
    }
    
    public boolean executarTempo1() { return true; }
    public boolean executarTempo2() { return true; }
    public boolean executarTempo3() { return true; }
    public boolean executarTempo4() { return true; }
}
