package pilarHeranca.comPOO.semInterface;

public class ExemploHeranca {
    public static void main(String[] args) {
        Carro carroACombustao = new CarroACombustao("Ford");
        carroACombustao.setLigado(true);
        if (carroACombustao.getLigado()) {
            System.out.println(carroACombustao.getMarca() + " (a combust�o) ligou.");
        } else {
            System.out.println(carroACombustao.getMarca() + " (a combust�o) n�o conseguiu ligar.");
        }
        carroACombustao.buzinar();
        
        Carro carroEletrico = new CarroEletrico("Ford");
        carroEletrico.setLigado(true);
        if (carroEletrico.getLigado()) {
            System.out.println(carroEletrico.getMarca() + " (el�trico) ligou.");
        } else {
            System.out.println(carroEletrico.getMarca() + " (el�trico) n�o conseguiu ligar.");
        }
        carroEletrico.buzinar();
    }
}
