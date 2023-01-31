package exercicios;

import java.util.Scanner;

import exercicios.exercicio16.Pessoa;

public class Exercicios {
    public static void main(String[] args) {
        exercicio13();
        exercicio14();
        exercicio15();
    }
    
    public static void exercicio13() {
        double[] notas = { 5.5, 6.5, 8.2, 4.0, 9.4 };
        double mediaTotal = calcularMedia(notas);
        informaStatus(mediaTotal);
    }
    
    public static void exercicio14() {
        Scanner entradaDoUsuario = new Scanner(System.in);
        
        int tempoEmSegundos = entradaDoUsuario.nextInt();
        
        int horas = calcularHorasInteiras(tempoEmSegundos);
        int minutos = calcularMinutosInteirosRemanescentes(tempoEmSegundos);
        int segundos = calcularSegundosRemanescentes(tempoEmSegundos);
        
        System.out.println(horas + "h" + minutos + "min" + segundos + "seg");
    }
    
    public static void exercicio15() {
        //Calculadora calculadora = new Calculadora();
        //calculadora.run();
    }
    
    
    public static double calcularMedia(double[] notas) {
        double mediaTotal = 0.0;
        for (int indice = 0; indice < notas.length; indice++)
            mediaTotal += notas[indice];
        mediaTotal /= notas.length;
        return mediaTotal;
    }
    
    public static void informaStatus(double media) {
        if (media > 6) System.out.println("Aprovado"); // media > 6
        else if (media > 4) System.out.println("Verificação suplementar"); // 4 < media <= 6
        else System.out.println("Reprovado"); // media <= 4
    }
    
    public static int calcularHorasInteiras(int segundos) {
        return segundos / 60 / 60;
    }
    
    public static int calcularMinutosInteirosRemanescentes(int segundos) {
        return segundos / 60 % 60;
    }
    
    public static int calcularSegundosRemanescentes(int segundos) {
        return segundos % 60 % 60;
    }
    
}
