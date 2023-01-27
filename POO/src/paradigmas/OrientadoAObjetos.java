package paradigmas;

import java.util.Arrays;

// Quarto paradigma. Anterior: funcional.

public class OrientadoAObjetos {
    public static void main(String[] args) {
        int[] arranjo = { 0, 20, 10, 12, 6, 16, 2, -2, 14, 4, 8, 18 };
        
        new AuxImpressora().imprimir("Arranjo original: ", arranjo);
        new AuxOrdenador().ordenar(arranjo);
        new AuxImpressora().imprimir("Arranjo ordenado: ", arranjo);
    }
}
