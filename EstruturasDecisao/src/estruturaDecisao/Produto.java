package estruturaDecisao;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    
    public Produto (String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    public void setNome(String novoNome) { this.nome = novoNome; }
    public String getNome() { return this.nome; }
    public void setPreco(double novoPreco) { this.preco = novoPreco; }
    public double getPreco() { return this.preco; }
    public void setQuantidade(int novaQuantidade) { this.quantidade = novaQuantidade; }
    public int getQuantidade() { return this.quantidade; }
}
