package pilarHeranca.comPOO.comInterface;

public abstract class Carro implements ICarro {
    protected String marca;
    protected boolean ligado;
    protected boolean sistemaEletricoPronto;
    protected boolean sistemaArPronto;
    protected boolean sistemaFrenagemPronto;
    
    public Carro(String marca) {
        this.marca = marca;
    }
    
    @Override
    public void buzinar() {
        System.out.println("Buzinou!");
    }
    
    public abstract boolean ligar();
    
    @Override
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    
    @Override
    public boolean getLigado() {
        return this.ligado;
    }
    
    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    @Override
    public String getMarca() {
        return this.marca;
    }
}
