package exercicios.exercicio17;

public class Pessoa {
    private String nome;
    private int idade;
    private Pessoa pai = null;
    private Pessoa mae = null;
    
    public Pessoa(String nome, int idade, Pessoa pai, Pessoa mae) {
        this.nome = nome;
        this.idade = idade;
        this.pai = pai;
        this.mae = mae;
    }
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }
    
    public Pessoa getPai() {
        return this.pai;
    }
    
    public Pessoa getMae() {
        return this.mae;
    }
}
