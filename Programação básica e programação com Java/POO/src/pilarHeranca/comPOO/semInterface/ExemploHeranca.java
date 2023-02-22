package pilarHeranca.comPOO.semInterface;

public class ExemploHeranca {
    public static void main(String[] args) {
        Carro carroACombustao = new CarroACombustao("Ford");
        carroACombustao.setLigado(true);
        if (carroACombustao.getLigado()) {
            System.out.println(carroACombustao.getMarca() + " (a combustão) ligou.");
        } else {
            System.out.println(carroACombustao.getMarca() + " (a combustão) não conseguiu ligar.");
        }
        carroACombustao.buzinar();
        
        Carro carroEletrico = new CarroEletrico("Ford");
        carroEletrico.setLigado(true);
        if (carroEletrico.getLigado()) {
            System.out.println(carroEletrico.getMarca() + " (elétrico) ligou.");
        } else {
            System.out.println(carroEletrico.getMarca() + " (elétrico) não conseguiu ligar.");
        }
        carroEletrico.buzinar();
    }
}
