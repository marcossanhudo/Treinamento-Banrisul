package pilarAbstracao;

public class ExemploAbstracao {
    public static void main(String[] args) {
        Carro carro = new Carro("Ford");
        carro.ligar();
        if (carro.ligado) {
            System.out.println(carro.marca + " ligou.");
        } else {
            System.out.println(carro.marca + " não conseguiu ligar.");
        }
    }
}
