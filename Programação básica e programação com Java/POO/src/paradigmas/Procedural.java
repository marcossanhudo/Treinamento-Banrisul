package paradigmas;

// Segundo paradigma. Anterior: imperativo. Próximo: funcional.

public class Procedural {
    public static void main(String[] args) {
        int[] arranjo = { 0, 20, 10, 12, 6, 16, 2, -2, 14, 4, 8, 18 };
        printArray("Arranjo original: ", arranjo);
        arranjo = sortArray(arranjo);
        printArray("Arranjo ordenado: ", arranjo);
    }
    
    public static void printArray(String titulo, int[] arranjo) {
        System.out.print(titulo);
        for (int indice = 0; indice < arranjo.length; indice++)
            System.out.print(arranjo[indice] + " ");
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
