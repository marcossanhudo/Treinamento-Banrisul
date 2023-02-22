package exercicios.exercicio16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entradaDoUsuario = new Scanner(System.in);
        String nome = "";
        String id = "";
        
        System.out.println("Informe seu nome.");
        nome = entradaDoUsuario.nextLine();
        System.out.println("Informe seu CPF, RG, ou número de CNH.");
        id = entradaDoUsuario.nextLine();
        Pessoa pessoa = new Pessoa(nome, id);
        
        System.out.println("Informe o nome do livro que você deseja pegar emprestado.");
        Livro livro = new Livro(entradaDoUsuario.nextLine(), "");
        
        Emprestimo emprestimo = livro.pegarEmprestado(pessoa);
        System.out.println(emprestimo.ticketDoEmprestimo());
    }
}
