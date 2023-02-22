package exercicios.exercicio16;

public class Livro {
    private String titulo;
    private String ISBN;
    private boolean emprestado;
    
    public Livro(String titulo, String ISBN) {
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.emprestado = false;
    }
    
    public Emprestimo pegarEmprestado(Pessoa pessoa) {
        if (!emprestado) return new Emprestimo(pessoa, this);
        else return null;
    }
    public void devolver(Emprestimo emprestimo) {
        emprestimo.fechar();
        this.emprestado = false;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return this.titulo;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public String getISBN() {
        return this.ISBN;
    }
    
}
