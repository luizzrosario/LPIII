import Classes.Data;
import Classes.Livro;
import Classes.LivroBiblioteca;

public class L7Q3 {
    public static void main(String[] args) {
        Livro livro1 = new Livro("GOT", "J. R. R. Martin", 2000, 600);
        LivroBiblioteca livroB = new LivroBiblioteca(livro1);
        Data data1 = new Data(22, 9, 2003);

        livroB.borrow(data1);
        System.out.println(livroB);

        livroB.giveBack();
        System.out.println(livroB);
    }
}
