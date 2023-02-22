package pilarHeranca.comPOO.semInterface;

public class CarroEletrico extends Carro {

    public CarroEletrico(String marca) {
        super(marca);
    }
    
    @Override
    public boolean ligar() {
        this.ligado = acionarBateriaParaMotorEletrico();
        this.sistemaEletricoPronto = this.ligado;
        this.sistemaArPronto = this.ligado;
        this.sistemaFrenagemPronto = this.ligado;
        return this.ligado;
    }
    
    private boolean acionarBateriaParaMotorEletrico() {
        boolean sucesso = true;
        return sucesso;
    }
}
