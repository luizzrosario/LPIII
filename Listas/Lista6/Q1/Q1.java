package Q1;

public class Q1 {
    public static void main(String[] args) {
        DataHora evento = new DataHora(23, 9, 2000, 19, 0, 8);
        DataHora outro = new DataHora(22, 9, 2003, 19, 0, 2);

        evento.imprimirDataHora();

        if(evento.isEqual(outro)){
            System.out.println("É igual");
        }
        else{
            System.out.println("Não é igual");
        }

        if(evento.isGreater(outro)){
            System.out.println("É maior");
        }
        else{
            System.out.println("Não é maior");
        }

        if(evento.isLower(outro)){
            System.out.println("É menor");
        }
        else{
            System.out.println("Não é menor");
        }
    }
}
