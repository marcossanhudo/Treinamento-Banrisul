package pilarEncapsulamento.gettersESetters;

public class ExemploEncapsulamento {
    public static void main(String[] args) {
        Carro carro = new Carro("Ford");
        carro.setLigado(true);
        if (carro.getLigado()) {
            System.out.println(carro.getMarca() + " ligou.");
        } else {
            System.out.println(carro.getMarca() + " não conseguiu ligar.");
        }
    }
}