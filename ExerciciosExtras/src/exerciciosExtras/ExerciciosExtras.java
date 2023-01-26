package exerciciosExtras;

import java.util.Scanner;
import java.util.Random;

public class ExerciciosExtras {
    public static void main(String[] args) {
        exercicioExtra1();
        exercicioExtra2();
        exercicioExtra3();
    }
    
    public static void exercicioExtra1() {
        int[] numerosAleatorios = new int[1000];
        for (int numeroAleatorio = 0; numeroAleatorio < numerosAleatorios.length; numeroAleatorio++) {
            numerosAleatorios[numeroAleatorio] = numeroAleatorio;
            
            if (numeroAleatorio < 10) System.out.println("Palíndromo: " + numeroAleatorio);

            String numAlEmString = "" + numeroAleatorio;
            int tamanhoDaString = numAlEmString.length();
            int indiceDaMetade = tamanhoDaString / 2;
            
            for (int indice = 0; indice < indiceDaMetade; indice++) {
                if (!numAlEmString.substring(indice, indice + 1)
                        .equals(numAlEmString.substring(tamanhoDaString - indice - 1, tamanhoDaString - indice)))
                    break;
                else if (indice == indiceDaMetade - 1)
                    System.out.println("Palíndromo: " + numeroAleatorio);
            }
        }
    }
    
    public static void exercicioExtra2() {
        Scanner entradaDoUsuario = new Scanner(System.in);
        int minimoInclusivo = entradaDoUsuario.nextInt();
        int maximoExclusivo = entradaDoUsuario.nextInt();
        
        for (int numeroEmTeste = minimoInclusivo; numeroEmTeste < maximoExclusivo; numeroEmTeste++) {
            if (numeroEmTeste == 2) System.out.println("Primo: " + numeroEmTeste);
            else for (int divisor = 2; divisor < numeroEmTeste; divisor++) {
                if (numeroEmTeste % divisor == 0)
                    break;
                else if (divisor == numeroEmTeste - 1)
                    System.out.println("Primo: " + numeroEmTeste);
            }
        }
    }
    
    public static void exercicioExtra3() {
        Random gerador = new Random();
        
        int[] arranj = new int[10];
        for (int indice = 0; indice < arranj.length; indice++) {
            arranj[indice] = gerador.nextInt(1000000);
        }
        
        boolean refazer = true;
        while (refazer) {
            refazer = false;
            for (int indice = 1; indice < arranj.length; indice++) {
                if (!(arranj[indice] > arranj[indice - 1])) {
                    refazer = true;
                    
                    int numeroAUsar = gerador.nextInt(arranj.length);
                    int[] numerosUsados = new int[0];
                    while (arranjoDeIntContem(numerosUsados, numeroAUsar))
                        numeroAUsar = gerador.nextInt(arranj.length);
                    numerosUsados = adicionaAArranjoDeInt(numerosUsados, numeroAUsar);
                    
                    int aux = arranj[indice];
                    arranj[indice] = arranj[numeroAUsar];
                    arranj[numeroAUsar] = aux;
                    
                    for (int i = 0; i < arranj.length; i++) System.out.print(arranj[i] + " ");
                    System.out.println();
                }
            }
        }
    }
    
    public static int[] adicionaAArranjoDeInt(int[] arranjoAtual, int novoElemento) {
        int[] arranjoComplementado = new int[arranjoAtual.length + 1];
        for (int indice = 0; indice < arranjoAtual.length; indice++)
            arranjoComplementado = arranjoAtual;
        arranjoComplementado[arranjoAtual.length] = novoElemento;
        return arranjoComplementado;
    }
    
    public static boolean arranjoDeIntContem(int[] arranjoAVerificar, int elementoAProcurar) {
        for (int indice = 0; indice < arranjoAVerificar.length; indice++)
            if (arranjoAVerificar[indice] == elementoAProcurar) return true;
        return false;
    }
}
