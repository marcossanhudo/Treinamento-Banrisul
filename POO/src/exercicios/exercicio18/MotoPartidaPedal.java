package exercicios.exercicio18;

public class MotoPartidaPedal extends Moto {
    private boolean aceleradorAcionado;
    
    public MotoPartidaPedal(String placa, String marca, String cor, int eixos) {
        super(placa, marca, cor, eixos);
    }
    
    @Override
    public void ligar() {
        if (aceleradorAcionado) this.ligado = true;
    }
    
    public void acionarAcelerador() {
        this.aceleradorAcionado = true;
    }
    
    public void soltarAcelerador() {
        this.aceleradorAcionado = false;
    }
}
