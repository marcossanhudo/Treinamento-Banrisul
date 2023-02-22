package pilarPolimorfismo;

public abstract class Carro {
    protected String marca;
    protected int rodas;
    protected boolean ligado = false;
    protected boolean sistemaEletricoPronto = false;
    protected boolean sistemaArPronto = false;
    protected boolean sistemaFrenagemPronto = false;
    
    public Carro(String marca) {
        this.marca = marca;
    }
    
    public void buzinar() {
        System.out.println(this.marca + " buzinou!");
    }
    
    public abstract boolean ligar();
    
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
        if (ligado == true) ligar();
        if (ligado == false) {
            sistemaEletricoPronto = false;
            sistemaArPronto = false;
            sistemaFrenagemPronto = false;
        }
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
}
