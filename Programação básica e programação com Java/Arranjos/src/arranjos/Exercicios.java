package arranjos;

import java.util.Random;

public class Exercicios {
    public static Random gerador = new Random();
    
    public static void main(String[] args) {
        exercicio10();
        exercicio11();
        exercicio12();
    }
    
    public static void exercicio10() {
        int soma = 0;
        int[][] matrizQuadrada = {{ 0, 1, 2, 3, 4 }, { 5, 6, 7, 8, 9 }, { 10, 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 }, { 21, 22, 23, 24, 25 }};
        for (int indice = 0; indice < 5; indice++)
            soma += matrizQuadrada[indice][indice];
        System.out.println(soma);
    }
    
    public static void exercicio11() {
        int[] numsAleatorios = new int[100];
        for (int iteracao = 0; iteracao < numsAleatorios.length; iteracao++) numsAleatorios[iteracao] = gerador.nextInt();
        
        for (int rodada = 0; rodada < numsAleatorios.length; rodada++)
            for (int indice = 1; indice < numsAleatorios.length; indice++)
                if (numsAleatorios[indice - 1] > numsAleatorios[indice]) {
                    int aux = numsAleatorios[indice - 1];
                    numsAleatorios[indice - 1] = numsAleatorios[indice];
                    numsAleatorios[indice] = aux;
                }
    }
    
    public static void exercicio12() {
        int tamanhoDosVetores = 50;
        int[] vetor1 = new int[tamanhoDosVetores];
        int[] vetor2 = new int[tamanhoDosVetores];
        for (int iteracao = 0; iteracao < tamanhoDosVetores; iteracao++) {
            vetor1[iteracao] = gerador.nextInt();
            vetor2[iteracao] = gerador.nextInt();
        }
    }
}
