package Classes;

public class LivroLivraria extends Livro {
    private static int estoque = 0;
    private double preco;

    public LivroLivraria(Livro livro, double preco){
        super(livro);
        this.preco = preco;
        estoque++;
    }

    public String toString(){
        return super.toString() + "\nPreço do livro: " + preco + "\nEstoque: " + estoque;
    }

    public void sell(){
        if(estoque == 0){
            System.out.println("Não temos estoque desde livro.");
        }
        else{
            System.out.println("Parabéns, você acabou de adquirir "+ super.getTitulo() + ". Aproveite!");
            estoque--;
        }

    }
}
