package exercicios.exercicio16;

import java.time.LocalDate;

public class Emprestimo {
    private Pessoa tomador;
    private Livro livro;
    private boolean aberto;
    private String dataAbertura;
    private String dataEsperadaFechamento;
    
    public Emprestimo(Pessoa novoTomador, Livro novoLivro) {
        this.tomador = novoTomador;
        this.livro = novoLivro;
        this.aberto = true;
        this.dataAbertura = LocalDate.now().toString();
        this.dataEsperadaFechamento = LocalDate.now().plusDays(7).toString();
    }
    
    public void fechar() {
        this.aberto = false;
    }
    
    public String ticketDoEmprestimo() {
        return "Emprestimo"
                + "\nLivro: " + livro.getTitulo() + "\t(ISBN " + livro.getTitulo() + ")"
                + "\nTomador do empréstimo: " + tomador.getNome()
                + "\nAbertura: " + dataAbertura
                + "\nDevolver livro antes de: " + dataEsperadaFechamento;
    }
    
    public void setTomador(Pessoa novoTomador) {
        this.tomador = novoTomador;
    }
    
    public Pessoa getTomador() {
        return this.tomador;
    }
    
    public void setLivro(Livro novoLivro) {
        this.livro = novoLivro;
    }
    
    public Livro getLivro() {
        return this.livro;
    }
    
}
