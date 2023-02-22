package pilarHeranca.comPOO.comInterface;

public interface ICarro {
    void buzinar();
    abstract boolean ligar();
    void setLigado(boolean ligado);
    boolean getLigado();
    void setMarca(String marca);
    String getMarca();
}
