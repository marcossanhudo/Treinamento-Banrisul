package conceitos;

import conceitos.Biscoito;
import conceitos.Pessoa;

public class Exemplos {
    public static void main(String[] args) {
        Pessoa renato = new Pessoa("Renato");
        renato.idade = 30;
        
        Pessoa andre = new Pessoa("André", 22);
        
        System.out.println(renato.nome + " tem " + renato.idade + " anos.");
        
        Biscoito negresco = new Biscoito();
        Biscoito trakinas = new Biscoito();
        
        boolean comeu = renato.comer(negresco);
        System.out.println("Comeu? " + (comeu ? "Sim" : "Não"));
    }
}
