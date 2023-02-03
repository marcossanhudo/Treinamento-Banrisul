package estruturasExtras;

import java.util.ArrayList;

public class ExemploForEach {
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<String>();
        frutas.add("Maçã");
        frutas.add("Pêssego");
        frutas.add("Uva");
        frutas.add("Laranja");
        
        for (String fruta: frutas) {
            System.out.println(fruta);
        }
    }
}
