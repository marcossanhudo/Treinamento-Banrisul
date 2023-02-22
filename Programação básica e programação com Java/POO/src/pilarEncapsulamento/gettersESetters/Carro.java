package pilarEncapsulamento.gettersESetters;

public class Carro {
    private String marca;
    private boolean ligado = false;
    private boolean sistemaEletricoPronto = false;
    private boolean sistemaArPronto = false;
    private boolean sistemaFrenagemPronto = false;
    
    public Carro(String marca) {
        this.marca = marca;
    }
    
    private void ligar() {
        this.ligado = acionarMotorACombustao();
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
    
    public boolean executarTempo1() { return true; }
    public boolean executarTempo2() { return true; }
    public boolean executarTempo3() { return true; }
    public boolean executarTempo4() { return true; }
}
