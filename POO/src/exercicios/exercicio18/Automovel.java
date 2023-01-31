package exercicios.exercicio18;

public class Automovel {
    protected String placa;
    protected String marca;
    protected String cor;
    protected int eixos;
    protected boolean ligado = false;
    
    public Automovel(String placa, String marca, String cor, int eixos) {
        this.placa = placa;
        this.marca = marca;
        this.cor = cor;
        this.eixos = eixos;
    }
    
    public void ligar() {
        this.ligado = true;
    }
}
