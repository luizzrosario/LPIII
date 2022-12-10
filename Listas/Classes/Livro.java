package Classes;

public class Livro {
    private String titulo, autor;
    private int numeroPag, anoPubli;

    public int getAnoPubli() {
        return anoPubli;
    }
    public String getAutor() {
        return autor;
    }
    public int getNumeroPag() {
        return numeroPag;
    }
    public String getTitulo() {
        return titulo;
    }

    public Livro(String t, String a, int ano, int pag){
        this.titulo = t;
        this.autor = a;
        this.anoPubli = ano;
        this.numeroPag = pag;
    }

    public Livro(Livro livro){
        this.titulo = livro.getTitulo();
        this.autor = livro.getAutor();
        this.anoPubli = livro.getAnoPubli();
        this.numeroPag = livro.getNumeroPag();
    }

    public String toString(){
        return "\nTítulo: " + titulo + "\nAutor: "+ autor +"\nNumero de Páginas: "+ numeroPag +"\nAno de publicação: "+ anoPubli;
    }
}
