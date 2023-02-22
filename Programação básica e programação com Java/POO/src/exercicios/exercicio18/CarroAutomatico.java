package exercicios.exercicio18;

public class CarroAutomatico extends Carro {
    private boolean freioAcionado;
    
    public CarroAutomatico(String placa, String marca, String cor, int eixos) {
        super(placa, marca, cor, eixos);
    }
    
    @Override
    public void ligar() {
        if (freioAcionado) this.ligado = true;
    }
    
    public void acionarFreio() {
        this.freioAcionado = true;
    }
    
    public void soltarFreio() {
        this.freioAcionado = false;
    }
}
