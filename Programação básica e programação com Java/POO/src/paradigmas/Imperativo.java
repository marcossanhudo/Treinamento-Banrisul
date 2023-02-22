package paradigmas;

// Dado um arranjo com elementos desordenados,
// imprima o arranjo, ordene os elementos, e imprima o arranjo de novo

// Primeiro paradigma. Próximo: procedural.

public class Imperativo {
    
    public static void main(String[] args) {
        int[] arranjo = { 0, 20, 10, 12, 6, 16, 2, -2, 14, 4, 8, 18 };

        System.out.print("Arranjo original: ");
        for (int indice = 0; indice < arranjo.length; indice++)
            System.out.print(arranjo[indice] + " ");
        
        for (int rodada = 0; rodada < arranjo.length; rodada++)
            for (int indice = 1; indice < arranjo.length; indice++)
                if (arranjo[indice] < arranjo[indice - 1]) {
                    int aux = arranjo[indice];
                    arranjo[indice] = arranjo[indice - 1];
                    arranjo[indice - 1] = aux;
                }
        
        System.out.print("Arranjo ordenado: ");
        for (int indice = 0; indice < arranjo.length; indice++)
            System.out.print(arranjo[indice] + " ");
    }
}
