import Classes.Cilindro;
import Classes.Cone;
import Classes.SolidoRedondo;

public class L7Q4 {
    public static void main(String[] args) {
        SolidoRedondo bola = new SolidoRedondo(3);
        Cilindro cilindro = new Cilindro(3, 10);
        Cone cone = new Cone(3, 10);
        
        System.out.println(bola);
        System.out.println(cilindro);
        System.out.println(cone);
    }
}
