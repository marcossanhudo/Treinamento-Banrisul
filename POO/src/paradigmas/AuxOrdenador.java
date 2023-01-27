package paradigmas;

public class AuxOrdenador {
    public int[] ordenar(int[] arranjo) {
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