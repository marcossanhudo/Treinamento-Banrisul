package exercicios;

import java.util.Scanner;
import java.lang.Math;

public class Calculadora {
    
    public void run() {
        System.out.println("Digite o cálculo que você quer fazer.");
        Scanner scanner = new Scanner(System.in);
        System.out.println(tentarCalculo(scanner.nextLine()));
        scanner.close();
    }
    
    public static double tentarCalculo (String calculo) {
        String[] termosDoCalculo = calculo.split(" ");
        
        if (!primeiroTermoValido(termosDoCalculo[0])) {
            return 0;
        }
        String ultimaOperacao = "";
        double ultimoNumero = Double.parseDouble(termosDoCalculo[0]);
        double total = Double.parseDouble(termosDoCalculo[0]);
        
        for (int indice = 1; indice < termosDoCalculo.length; indice++) {
            try {
                   ultimoNumero = Double.parseDouble(termosDoCalculo[indice]);
                   total = fazerCalculo(total, ultimaOperacao, ultimoNumero);
            } catch (Exception e) {
                ultimaOperacao = termosDoCalculo[indice];
            }
        }
        
        return total;
    }
    
    public static boolean primeiroTermoValido(String termo) {
        try {
            Double.parseDouble(termo);
            return true;
        } catch (Exception e) { return false; }
    }
    
    public static double fazerCalculo(double total, String ultimaOperacao, double ultimoNumero) {
        switch (ultimaOperacao) {
            case "+":
                total = soma(total, ultimoNumero);
                break;
            case "-":
                total = subtracao(total, ultimoNumero);
                break;
            case "*":
                total = multiplicacao(total, ultimoNumero);
                break;
            case "/":
                total /= divisao(total, ultimoNumero);
                break;
            case "^":
                total = Math.pow(total, ultimoNumero);
                break;
        }
        return total;
    }
    
    public static double soma(double parcela1, double parcela2) {
        return parcela1 + parcela2;
    }
    
    public static double subtracao(double minuendo, double subtraendo) {
        return minuendo - subtraendo;
    }
    
    public static double multiplicacao(double multiplicando, double multiplicador) {
        return multiplicando * multiplicador;
    }
    
    public static double divisao(double dividendo, double divisor) {
        return dividendo / divisor;
    }
}
