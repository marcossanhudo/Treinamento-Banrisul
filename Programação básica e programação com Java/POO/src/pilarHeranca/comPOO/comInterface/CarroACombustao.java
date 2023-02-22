package pilarHeranca.comPOO.comInterface;

public class CarroACombustao extends Carro {
    public CarroACombustao(String marca) {
        super(marca);
    }
    
    @Override
    public boolean ligar() {
        this.ligado = acionarMotorACombustao();
        this.sistemaEletricoPronto = this.ligado;
        this.sistemaArPronto = this.ligado;
        this.sistemaFrenagemPronto = this.ligado;
        return this.ligado;
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
