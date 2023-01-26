package exerciciosExtras;

import java.util.Scanner;

public class ExerciciosExtras {
    public static void main(String[] args) {
        exercicioExtra1();
        exercicioExtra2();
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
}
