import Classes.Ponto;

public class L7Q1 {
    public static void main(String[] args) {
        Ponto p1 = new Ponto(0,5);
        Ponto p2 = new Ponto(7, 2);

        if (p1.isOrigin()) {
            System.out.println("É origem");
        }

        if (p1.isAxis()) {
            System.out.println("Está em um eixo");
        }

        if (p1.isAxisX()) {
            System.out.println("Está no eixo X");
        }

        if (p1.isAxisY()) {
            System.out.println("Está no eixo Y");
        }

        System.out.println(p1.distanceFrom(p2));
    }
}
