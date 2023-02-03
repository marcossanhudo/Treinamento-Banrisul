package enums;

public enum Cor {
    BRANCO(255, 255, 255),
    VERMELHO(255, 0, 0),
    VERDE(0, 255, 0),
    AZUL(0, 0, 255),
    PRETO(0, 0, 0);
    
    int r;
    int g;
    int b;
    
    Cor(){ r = 0; g = 0; b = 0; }
    Cor(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }
    
    @Override
    public String toString() {
        return "(" + r + ", " + g + ", " + b + ")";
    }
    
    public String toString(boolean aux) {
        return this.name();
    }
}
