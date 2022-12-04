import Classes.Ponto;

public class Q4 {
    public static void main(String[] args) {
        Ponto ponto1 = new Ponto(-1, -5);
        Ponto ponto2 = new Ponto(6, 8);

        System.out.println(Ponto.distance(ponto1, ponto2));

        System.out.println(Ponto.distance(ponto2));

        System.out.println(Ponto.quadrante(ponto1));
    }
}
