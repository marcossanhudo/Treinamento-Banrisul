package pilarHeranca.semPOO;

public class ExemploHeranca {
    public static void main(String[] args) {
        Carro carroACombustao = new Carro("Ford", 1);
        carroACombustao.setLigado(true);
        if (carroACombustao.getLigado()) {
            System.out.println(carroACombustao.getMarca() + " (a combustão) ligou.");
        } else {
            System.out.println(carroACombustao.getMarca() + " (a combustão) não conseguiu ligar.");
        }
        
        Carro carroEletrico = new Carro("Ford", 2);
        carroEletrico.setLigado(true);
        if (carroEletrico.getLigado()) {
            System.out.println(carroEletrico.getMarca() + " (elétrico) ligou.");
        } else {
            System.out.println(carroEletrico.getMarca() + " (elétrico) não conseguiu ligar.");
        }
    }
}
