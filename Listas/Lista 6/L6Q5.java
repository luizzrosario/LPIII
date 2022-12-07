import Classes.Ponto;
import Classes.Triangulo;

public class L6Q5 {
    public static void main(String[] args) {
        Ponto p1 = new Ponto(0, 0);
        Ponto p2 = new Ponto(6, 0);
        Ponto p3 = new Ponto(3, 5);
        //Retangulo = (3, 0), (0, 4), (0, 0)
        //Isóceles = (3, 0), (0, 3), (0, 0)

        Triangulo t1 = new Triangulo(p1, p2, p3);

        System.out.println(t1.imprimeTriangulo());

        if(t1.isEquilatero()){
            System.out.println("Equilatero");
        }
        if(t1.isIsoceles()){
            System.out.println("Isoceles");
        }
        if(t1.isRetangulo()){
            System.out.println("Retangulo");
        }
    }
    
}
