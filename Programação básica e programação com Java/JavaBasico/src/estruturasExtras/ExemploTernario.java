package estruturasExtras;

public class ExemploTernario {
    public static void main(String[] args) {
        final double MEDIA = 7;
        double nota = 6.9;
        
        if (nota >= MEDIA) System.out.println("Passou");
        else System.out.println("N�o passou");
        
        System.out.println(nota >= MEDIA ? "Passou" : "N�o passou");
        
        boolean passou = nota >= MEDIA;
        passou = nota >= MEDIA ? true : false;
    }
}
