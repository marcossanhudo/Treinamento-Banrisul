package pilarPolimorfismo;

public class Concessionaria {
    public boolean revisar(Carro carro) {
        CarroACombustao cAComb = (CarroACombustao) carro;
        cAComb.setLigado(true);
        System.out.println("Revisando o " + cAComb.getMarca());
        System.out.println(cAComb.getLigado());
        return true;
    }
}
