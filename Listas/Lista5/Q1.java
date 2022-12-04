import Classes.Contato;

public class Q1 {
    public static void main(String [] args) {
        Contato contato1 = new Contato("luiz", 988888888 ,"luiz@gmail.com", 22, 9, 2003);
        Contato contato2 = new Contato();
        Contato contato3 = new Contato();

        contato1.imprimirContato();
    }
}
