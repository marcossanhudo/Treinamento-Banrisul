package Main;

public class Cliente {

    private int ind;
    private String nome;

    public Cliente(int ind, String nome) {
        this.ind = ind;
        this.nome = nome;
    }

    public int getInd() {
        return ind;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
