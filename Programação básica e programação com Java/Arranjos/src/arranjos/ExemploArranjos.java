package arranjos;

public class ExemploArranjos {
    public static void main(String[] args) {
        
        // vetores (arranjos de apenas uma dimensão)
        int[] vetor = { 14, 17, 25 };
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        
        // matrizes (arranjos de mais de uma dimensão)
            // duas dimensões
            int[][] matriz2d = {{ 100, 50, 70 }, { 24, -8, 35 }, { 9, 90, 999 }};
            for (int i = 0; i < matriz2d.length; i++) {
                for (int j = 0; j < matriz2d[i].length; j++) {
                    System.out.println(matriz2d[i][j]);
                }
            }
            
            // três dimensões
            int[][][] matriz3d = {{{ 0, 1 }, { 3, 6 }, { 7, 16 } }, { { 9, 18 }, { 8, 87 }, { 85, 75 }}, {{ 12, 22}, { 13, 33 }, { 44, 88 }}};
            for (int i = 0; i < matriz3d.length; i++) {
                for (int j = 0; j < matriz3d[i].length; j++) {
                    for (int k = 0; k < matriz3d[j].length; k++) {
                        System.out.println(matriz3d[i][j][k]);
                    }
                }
            }
    }
}
