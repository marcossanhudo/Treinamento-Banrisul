package estruturaDecisao;

import java.util.Random;
import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        exercicio1();
        exercicio2();
        exercicio3();
        exercicio4();
        exercicio5();
    }
    
    public static void exercicio1() {
        int idade = 19;
        
        if (idade >= 18)
            System.out.println(true);
        else
            System.out.println(false);
    }
    
    public static void exercicio2() {
        Produto produto1 = new Produto("Arroz", 7.00, 1);
        Produto produto2 = new Produto("Feijão", 9.00, 1);
        Produto produto3 = new Produto("Ovo", 6.00, 12);
        Produto[] produtos = { produto1, produto2, produto3 };
        
        for (int indice = 0; indice < produtos.length; indice++) {
            double total = produtos[indice].getPreco() * produtos[indice].getQuantidade();
            
            if (produtos[indice].getQuantidade() <= 10) ;
            else if (produtos[indice].getQuantidade() >= 11 && produtos[indice].getQuantidade() <= 20)
                total -= total / 100 * 10;
            else if (produtos[indice].getQuantidade() >= 21 && produtos[indice].getQuantidade() <= 50)
                total -= total / 100 * 20;
            else if (produtos[indice].getQuantidade() > 50)
                total -= total / 100 * 25;
            
            System.out.println(total);
            
        }
    }
    
    public static void exercicio3() {
        // 0 para pedra, 1 para papel, 2 para tesoura
        boolean continuar = true;
        
        while (continuar == true) {
            System.out.println("Digite \"pedra\", \"papel\", ou \"tesoura\" para jogar. Digite qualquer outra coisa para sair.");
            
            String[] nomesDasJogadas = { "pedra", "papel", "tesoura" };
            Random gerador = new Random();
            Scanner scanner = new Scanner(System.in);
            String jogadaDoUsuario = scanner.nextLine();
            
            String jogadaDoComputador = nomesDasJogadas[gerador.nextInt(2)];
            System.out.println(jogadaDoComputador);
            if (jogadaDoUsuario == jogadaDoComputador) System.out.println("Empate!");
            else switch (jogadaDoUsuario) {
                case "pedra":
                    if (jogadaDoComputador == "tesoura")
                        System.out.println("Você ganhou!");
                    else
                        System.out.println("Você errou!");
                    break;
                case "papel":
                    if (jogadaDoComputador == "pedra")
                        System.out.println("Você ganhou!");
                    else
                        System.out.println("Você errou!");
                    break;
                case "tesoura":
                    if (jogadaDoComputador == "papel")
                        System.out.println("Você ganhou!");
                    else
                        System.out.println("Você errou!");
                    break;
                default:
                    continuar = false;
                    break;
            }
        }
    }
    
    public static void exercicio4() {
        System.out.println("Digite o cálculo que você quer fazer.");
        Scanner scanner = new Scanner(System.in);
        double ultimoNumero = 0.0;
        String ultimaOperacao = "";
        double total = 0.0;
        
        String calculo = scanner.nextLine();
        String[] calculoTermos = calculo.split(" ");
        
        try {
            ultimoNumero = Double.parseDouble(calculoTermos[0]);
            total = Double.parseDouble(calculoTermos[0]);
        } catch (Exception e) { ; }
        
        for (int indice = 1; indice < calculoTermos.length; indice++) {
            try {
                   ultimoNumero = Double.parseDouble(calculoTermos[indice]);
                   switch (ultimaOperacao) {
                       case "+":
                           total += ultimoNumero;
                           break;
                       case "-":
                           total -= ultimoNumero;
                           break;
                       case "*":
                           total *= ultimoNumero;
                           break;
                       case "/":
                           total /= ultimoNumero;
                           break;
               }
            } catch (Exception e) {
                ultimaOperacao = calculoTermos[indice];
            }
        }
        
        System.out.println(total);
        
        scanner.close();
    }
    
    public static void exercicio5() {
        for (int fator1 = 1; fator1 <= 10; fator1++) {
            for (int fator2 = 1; fator2 <= 10; fator2++) {
                System.out.print(fator2 + " × " + fator1 + " = " + (fator2 * fator1) + "\t");
            }
            System.out.println();
        }
    }
}


