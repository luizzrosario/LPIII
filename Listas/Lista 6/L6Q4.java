import Classes.Ponto;
import Classes.SegmentoDeReta;

public class L6Q4 {
    public static void main(String[] args) {
        Ponto ponto1 = new Ponto(2, 1);
        Ponto ponto2 = new Ponto(7, 1);
        SegmentoDeReta reta = new SegmentoDeReta(ponto1, ponto2);

        System.out.println(reta.imprimeSegmento());
    }
}
