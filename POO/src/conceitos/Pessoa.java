package conceitos;

import conceitos.Biscoito;

public class Pessoa {
    public String nome;
    private boolean bocaAberta = true;
    public boolean gostaDeBiscoito = true;
    
    public void comer(Biscoito biscoito) {
        if (gostaDeBiscoito && bocaAberta)
            System.out.println("Aceito. Obrigado.");
        else
            System.out.println("Não, não gosto. Obrigado.");
    }
}
