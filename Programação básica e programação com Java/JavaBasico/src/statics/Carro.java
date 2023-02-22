package statics;

public final class Carro {
    private String marca;
    private int rodas;
    
    public Carro() {
        
    }
    public Carro(String marca, int rodas) {
        this.marca = marca;
        this.rodas = rodas;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getMarca() {
        return this.marca;
    }
    public void setRodas(int rodas) {
        this.rodas = rodas;
    }
    public int getRodas() {
        return this.rodas;
    }
    
    public final void ligar() {
        ;
    }
    
    protected static final String DEFINICAO = "Carro";
    public static Carro criar(String marca, int rodas) {
        return new Carro(marca, rodas);
    }
    private static String definicao = "Carro";
    public static String getDefinicao() {
        return definicao;
    }
    public static String getFinalDefinicao() {
        return DEFINICAO;
    }
    public static void setDefinicao(String definicao) {
        Carro.definicao = definicao;
    }
}
