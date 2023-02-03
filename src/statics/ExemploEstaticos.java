package statics;

public class ExemploEstaticos {
    public static void main(String[] args) {
        Carro car = new Carro();
        car.setMarca("Tesla");
        System.out.println(Carro.getDefinicao() + " " + car.getDefinicao());
        
        Carro.setDefinicao("definido");
        System.out.println(Carro.getDefinicao());
        System.out.println(Carro.getFinalDefinicao());
    }
}
