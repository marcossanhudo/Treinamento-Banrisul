package exercicios.exercicio19;

import java.util.Scanner;

public class Main {
    public static Contato[] contatosSalvos = new Contato[0];
    
    public static void main(String[] args) {
        boolean usarApp = true;
        Scanner entradaDoUsuario = new Scanner(System.in);
        
        while (usarApp) {
            System.out.println("[0] Sair");
            System.out.println("[1] Listar contatos");
            System.out.println("[2] Adicionar contato");
            System.out.println("[3] Remover contato");
            switch(entradaDoUsuario.nextInt()) {
                case 0: usarApp = false; break;
                case 1: listarContatos(); break;
                case 2: interfaceAdicionarContato(entradaDoUsuario); break;
                case 3: interfaceRemoverContato(entradaDoUsuario); break;
                default: break;
            }
        }
    }
    
    public static void listarContatos() { listarContatos(0); }
    public static void listarContatos(int offset) {
        for (int indice = 0; indice < contatosSalvos.length; indice++)
            System.out.println("[" + (indice + offset) + "] " + contatosSalvos[indice].gerarTicket());
    }
    
    public static void interfaceAdicionarContato(Scanner entradaDoUsuario) {
        System.out.println("Informe o nome do seu novo contato.");
        String nome = entradaDoUsuario.nextLine();
        
        System.out.println("Informe o email do seu novo contato.");
        String email = entradaDoUsuario.nextLine();
        
        System.out.println("Informe o telefone do seu novo contato.");
        String telefone = entradaDoUsuario.nextLine();
        
        Contato novoContato = new Contato(nome, email, telefone);
        
        System.out.println(novoContato.gerarTicket());
        System.out.println("Salvar este contato?\n[0] Não\n[1] Sim");
        
        switch (entradaDoUsuario.nextInt()) {
            case 0:
                System.out.println("Contato descartado.");
                break;
            case 1:
                adicionarContato(novoContato);
                System.out.println("Contato salvo.");
                break;
        }
        
    }
    
    public static void interfaceRemoverContato(Scanner entradaDoUsuario) {
        System.out.println("[0] Cancelar");
        System.out.println("Use os números abaixo para remover o contato desejado.");
        listarContatos(1);
        int indiceDoContatoARemover = entradaDoUsuario.nextInt();
        System.out.println("Remover este contato?\n" + contatosSalvos[indiceDoContatoARemover].gerarTicket());
        System.out.println("[0] Não\n[1] Sim");
        switch (entradaDoUsuario.nextInt()) {
            case 0:
                removerContato(indiceDoContatoARemover);
                System.out.println("Contato removido.");
                break;
            case 1:
                System.out.println("Contato mantido.");
                break;
        }
    }
    
    public static void adicionarContato(Contato novoContato) {
        Contato[] arranjoAtualizado = new Contato[contatosSalvos.length + 1];
        for (int indice = 0; indice < contatosSalvos.length; indice++)
            arranjoAtualizado[indice] = contatosSalvos[indice];
        arranjoAtualizado[contatosSalvos.length] = novoContato;
        contatosSalvos = arranjoAtualizado;
    }
    
    public static void removerContato(int indiceDoContato) {
        Contato[] arranjoAtualizado = new Contato[contatosSalvos.length - 1];
        for (int indice = 0; indice < indiceDoContato; indice++)
            arranjoAtualizado[indice] = contatosSalvos[indice];
        for (int indice = indiceDoContato + 1; indice < contatosSalvos.length; indice++)
            arranjoAtualizado[indice - 1] = contatosSalvos[indice];
        contatosSalvos = arranjoAtualizado;
    }
}
