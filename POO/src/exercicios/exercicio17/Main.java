package exercicios.exercicio17;

public class Main {
    public static void main(String[] args) {
        Pessoa pai = new Pessoa("Jo�o", 30);
        Pessoa mae = new Pessoa("Maria", 30);
        Pessoa filho = new Pessoa("Jo�o J�nior", 2, pai, mae);
    }
}