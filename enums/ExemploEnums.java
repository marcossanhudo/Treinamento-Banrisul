package enums;

public class ExemploEnums {
    public static void main(String[] args) {
        System.out.printf("A cor é %s\n", Cor.VERMELHO);
        
        Cor cor = Cor.VERDE;
        System.out.printf("A cor é %s\n", cor);
        
        System.out.printf("A cor é %s\n", Cor.AZUL);
        
        switch (cor) {
            case VERMELHO:
                System.out.println("Vermelho");
                break;
            case VERDE:
                System.out.println("Verde");
                break;
            case AZUL:
                System.out.println("Azul");
                break;
            default:
                break;
        }
        
        Cor[] cores = { Cor.VERMELHO, Cor.AZUL };
        for (Cor corDoLoop: cores)
            System.out.println(cor);
    }
}
