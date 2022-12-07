package Classes;

public class Triangulo {
    Ponto ponto1;
    Ponto ponto2;
    Ponto ponto3;

    public Triangulo(Ponto p1, Ponto p2, Ponto p3) {

        /*
         * if (p1.getX() == p2.getX() == p3.getX() || (p1.getY() == p2.getY() ==
         * p3.getY())) {
         * System.out.println("Não foi possível formar um ponto!");
         * return;
         * }
         */

        this.ponto1 = p1;
        this.ponto2 = p2;
        this.ponto3 = p3;
    }

    public String imprimeTriangulo() {
        return "Este triangulo é formado pelos pontos:\n" + ponto1.imprimePonto() + "\n" + ponto2.imprimePonto() + "\n"
                + ponto3.imprimePonto();
    }

    public boolean isIsoceles() {
        if (Ponto.distance(ponto1, ponto2) == Ponto.distance(ponto2, ponto3)
                || Ponto.distance(ponto2, ponto3) == Ponto.distance(ponto3, ponto1)
                || Ponto.distance(ponto3, ponto1) == Ponto.distance(ponto1, ponto2)) {
            return true;
        }
        return false;
    }

    public boolean isRetangulo() {
        if ((Ponto.distance(ponto1, ponto2) * Ponto.distance(ponto1, ponto2) + Ponto.distance(ponto2, ponto3)
                * Ponto.distance(ponto2, ponto3) == Ponto.distance(ponto3, ponto1) * Ponto.distance(ponto3, ponto1))
                ||
                (Ponto.distance(ponto2, ponto3) * Ponto.distance(ponto3, ponto1) + Ponto.distance(ponto3, ponto1)
                        * Ponto.distance(ponto3, ponto1) == Ponto.distance(ponto1, ponto2)
                                * Ponto.distance(ponto1, ponto2))
                ||
                (Ponto.distance(ponto3, ponto1) * Ponto.distance(ponto3, ponto1)
                        + Ponto.distance(ponto1, ponto2) * Ponto.distance(ponto1, ponto2) == Ponto.distance(ponto2,
                                ponto3) * Ponto.distance(ponto2, ponto3))) {
            return true;
        }
        return false;
    }

    public boolean isEquilatero(){
        if(Ponto.distance(ponto1, ponto2) == Ponto.distance(ponto2, ponto3)
        && Ponto.distance(ponto2, ponto3) == Ponto.distance(ponto3, ponto1)){
            return true;
        }
        return false;
    }
}
