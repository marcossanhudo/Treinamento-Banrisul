package paradigmas;

public class AuxImpressora {
    public void imprimir(String titulo, int[] arranjo) {
        System.out.println(titulo);
        for (int indice = 0; indice < arranjo.length; indice++)
            System.out.print(arranjo[indice] + " ");
    }
    
}
