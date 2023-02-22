package exercicios.exercicio18;

public class Guincho extends Automovel {
    private Automovel carregando;
    
    public Guincho(String placa, String marca, String cor, int eixos) {
        super(placa, marca, cor, eixos);
    }
    
    public void carregar(Carro aCarregar) {
        this.carregando = aCarregar;
    }
    public void carregar(Moto aCarregar) {
        this.carregando = aCarregar;
    }
    
    public void descarregar() {
        this.carregando = null;
    }
}
