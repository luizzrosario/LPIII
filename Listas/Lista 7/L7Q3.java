import Classes.Data;
import Classes.Livro;
import Classes.LivroBiblioteca;
import Classes.LivroLivraria;

public class L7Q3 {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Game of Thrones", "J. R. R. Martin", 2000, 600);
        LivroBiblioteca livroB = new LivroBiblioteca(livro1);
        Data data1 = new Data(22, 9, 2003);
        LivroLivraria livroL = new LivroLivraria(livro1, 20);

        livroB.borrow(data1);
        System.out.println(livroB);

        livroB.giveBack();
        System.out.println(livroB);

        System.out.println(livroL);
        livroL.sell();
        livroL.sell();
    }
}
