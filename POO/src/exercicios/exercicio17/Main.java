package exercicios.exercicio17;

public class Main {
    public static void main(String[] args) {
        Pessoa pai = new Pessoa("João", 30);
        Pessoa mae = new Pessoa("Maria", 30);
        Pessoa filho = new Pessoa("João Júnior", 2, pai, mae);
    }
}