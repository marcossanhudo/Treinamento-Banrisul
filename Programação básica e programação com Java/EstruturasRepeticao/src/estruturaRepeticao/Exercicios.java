package estruturaRepeticao;

import java.util.Random;
import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        exercicio5();
        exercicio6();
        exercicio7();
        exercicio8();
        exercicio9();
    }
    
    public static void exercicio5() {
        for (int fator1 = 1; fator1 <= 10; fator1++) {
            for (int fator2 = 1; fator2 <= 10; fator2++) {
                System.out.print(fator2 + " × " + fator1 + " = " + (fator2 * fator1) + "\t");
            }
            System.out.println();
        }
    }
    
    public static void exercicio6() {
        int quantiaAGerar = 10;
        
        Random gerador = new Random();
        int[] numerosGerados = new int[quantiaAGerar];
        for (int iteracao = 0; iteracao < quantiaAGerar; iteracao++) {
            numerosGerados[iteracao] = gerador.nextInt(100);
            System.out.print(numerosGerados[iteracao] + "\t");
        }
        
        int menor = numerosGerados[0];
        int maior = numerosGerados[0];
        for (int indice = 0; indice < numerosGerados.length; indice++) {
           if (numerosGerados[indice] > maior)
               maior = numerosGerados[indice];
           if (numerosGerados[indice] < menor)
               menor = numerosGerados[indice];
        }
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
    
    public static void exercicio7() {
        Scanner scanner = new Scanner(System.in);
        int ultimaIteracao = scanner.nextInt();
        
        int numeroAtual = 1;
        int numeroAnterior = 0;
        
        int iteracao = 0;
        while (iteracao <= ultimaIteracao) {
            int aux = numeroAtual;
            numeroAtual += numeroAnterior;
            numeroAnterior = aux;
            System.out.println("Iteração " + iteracao + ": " + numeroAtual);
            iteracao++;
        }
    }
    
    public static void exercicio8() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.nextInt() != 10) {
            System.out.println("Esperando 10.");
        }
    }
    
    public static void exercicio9() {
        Scanner scanner = new Scanner(System.in);
        int ultimoNumero = scanner.nextInt();
        
        int numeroAtual = 1;
        int numeroAnterior = 0;
        
        while ((numeroAtual + numeroAnterior) <= ultimoNumero) {
            int aux = numeroAtual;
            numeroAtual += numeroAnterior;
            numeroAnterior = aux;
            System.out.println(numeroAtual);
        }
    }
    
}