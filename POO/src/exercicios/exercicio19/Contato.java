package exercicios.exercicio19;

public class Contato {
    private String nome;
    private String email;
    private String telefone;
    
    public Contato(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }
    
    public String gerarTicket() {
        return "-----------------------"
                + "\nContato " + this.toString()
                + "\nNome: " + this.nome
                + "\nEmail: " + this.email
                + "\nTelefone: " + this.telefone
                + "\n-----------------------";
    }
}
