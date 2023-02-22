package interfaces;

public interface Funcionario extends Pessoa {
    public double calcularSalario();
    public void cumprirCargaHoraria();
    public default void baterPonto() {
        System.out.println("Bati ponto");
    } 
    public void andar();
}
