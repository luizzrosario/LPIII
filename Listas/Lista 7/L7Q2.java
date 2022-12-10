import Classes.Ponto;
import Classes.Ponto3D;

public class L7Q2 {
    public static void main(String[] args) {
        Ponto3D p1 = new Ponto3D(1, 3, 4);
        Ponto3D p2 = new Ponto3D(p1);
        Ponto p3 = new Ponto(1, 3);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
