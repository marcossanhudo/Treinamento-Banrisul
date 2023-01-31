package exercicios.exercicio16;

public class Pessoa {
    private String nome;
    private String doc;
    
    public Pessoa(String nome, String doc) {
        this.nome = nome;
        this.doc = doc;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }
    public void setDoc(String doc) {
        this.doc = doc;
    }
    public String getDoc() {
        return this.doc;
    }
}
