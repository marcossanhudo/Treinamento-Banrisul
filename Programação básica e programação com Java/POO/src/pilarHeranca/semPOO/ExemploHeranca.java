package pilarHeranca.semPOO;

public class ExemploHeranca {
    public static void main(String[] args) {
        Carro carroACombustao = new Carro("Ford", 1);
        carroACombustao.setLigado(true);
        if (carroACombustao.getLigado()) {
            System.out.println(carroACombustao.getMarca() + " (a combust�o) ligou.");
        } else {
            System.out.println(carroACombustao.getMarca() + " (a combust�o) n�o conseguiu ligar.");
        }
        
        Carro carroEletrico = new Carro("Ford", 2);
        carroEletrico.setLigado(true);
        if (carroEletrico.getLigado()) {
            System.out.println(carroEletrico.getMarca() + " (el�trico) ligou.");
        } else {
            System.out.println(carroEletrico.getMarca() + " (el�trico) n�o conseguiu ligar.");
        }
    }
}
