import Classes.Contato;

public class L5Q1 {
    public static void main(String[] args) {
        Contato contato1 = new Contato("luiz", 988888888, "luiz@gmail.com", 22, 9, 2003);
        // Contato contato2 = new Contato();
        // Contato contato3 = new Contato();

        Contato.imprimirContagem();

        contato1.imprimirContato();
    }
}
