package casting;

public class ExemploCasting {
    public static void main(String[] args) {
        short matrioshkaPP = 1000;
        int matrioshkaP = 1000000;
        long matrioshkaM = 1000000000;
        double matrioshkaG = 1000000000;
        float matrioshkaGG = 1000000000000000f;
        
        matrioshkaG = (double) matrioshkaGG;
        matrioshkaM = (long) matrioshkaG;
        matrioshkaP = (int) matrioshkaM;
        matrioshkaPP = (short) matrioshkaP;  
        System.out.println(matrioshkaGG);
        System.out.println(matrioshkaG);
        System.out.println(matrioshkaM);
        System.out.println(matrioshkaP);
        System.out.println(matrioshkaPP);
        
        char charB = 98;
        int int98 = 'b';
        
        System.out.println(charB);
        System.out.println(int98);
        
        String str10 = "10";
        int int10 = Integer.parseInt(str10);
        System.out.println(str10);
        System.out.println(int10);
        
        double double10_5 = 10.5;
        String string10_5 = String.valueOf(double10_5);
        System.out.println(string10_5);
        
        String stringXYZ = "XYZ";
        char charY = stringXYZ.charAt(1);
        System.out.println(charY);
        String stringY = Character.toString(charY);
        System.out.println(stringY);
        
        boolean booleanTrue = true;
        String stringTrue = Boolean.toString(booleanTrue);
        System.out.println(stringTrue);
        
        int intTrue = 150;
        booleanTrue = intTrue == 151;
        System.out.println(intTrue);
        
        Pai pai = new Pai();
        Filho filho = new Filho();
        pai = (Pai) filho;
        Pai pai2 = new Filho();
        filho = (Filho) pai;
        System.out.println(pai);
        System.out.println(filho);
        
        imprimir(pai, filho);
    }
    
    public static void imprimir(Pai pai1, Pai pai2) {
        System.out.println(pai1);
        System.out.println(pai2);
    }
}
