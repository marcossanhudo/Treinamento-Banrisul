package paradigmas;

import java.util.Arrays;

// Terceiro paradigma. Anterior: procedural. Próximo: orientado a objetos.

public class Funcional {
    
    public static void main(String[] args) {
        int[] arranjo = { 0, 20, 10, 12, 6, 16, 2, -2, 14, 4, 8, 18 };
        
        System.out.print("Arranjo original: ");
        Arrays.toString(arranjo);
        
        int[] arranjoOrdenado = sortArray(arranjo);
        
        System.out.print("Arranjo ordenado: ");
        Arrays.toString(arranjo);
    }
    
    public static int[] sortArray(int[] arranjo) {
        for (int rodada = 0; rodada < arranjo.length; rodada++)
            for (int indice = 1; indice < arranjo.length; indice++)
                if (arranjo[indice] < arranjo[indice - 1]) {
                    int aux = arranjo[indice];
                    arranjo[indice] = arranjo[indice - 1];
                    arranjo[indice - 1] = aux;
                }
        return arranjo;
    }
}
