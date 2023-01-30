package conceitos;

import conceitos.Biscoito;

public class Pessoa {
    public String nome;
    public int idade;
    private boolean bocaAberta = true;
    public boolean gostaDeBiscoito = true;
    
    public Pessoa(String nome) {
        this(nome, -1);
    }
    
    public Pessoa() {
        this("Indigente", -1);
    }
    
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public boolean comer(Biscoito biscoito) {
        if (gostaDeBiscoito && bocaAberta) {
            System.out.println("Aceito. Obrigado.");
            return true;
        } else {
            System.out.println("Não, não gosto. Obrigado.");
            return false;
        }
    }
    
    public boolean falar(String frase) {
        return true;
    }
}
