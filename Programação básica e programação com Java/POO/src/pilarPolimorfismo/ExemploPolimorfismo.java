package pilarPolimorfismo;

public class ExemploPolimorfismo {
    public static void main(String[] args) {
        Concessionaria conc = new Concessionaria();
        
        CarroACombustao cAComb = new CarroACombustao("Ford");
        CarroEletrico cElet = new CarroEletrico("Ford");
        
        conc.revisar(cAComb);
    }
}
