import Classes.Data;

public class L5Q3 {
    public static void main(String[] args) {
        int diasFaltando;
        String aux;

        Data data1 = new Data(4, 12, 2000);

        diasFaltando = Data.howManyDaysUndilEndYear(data1);

        System.out.println(diasFaltando);

        aux = data1.imprimirData();
        System.out.println(aux);

        aux = data1.imprimirDataS();
        System.out.println(aux);

        if (data1.isBissexto()) {
            System.out.println("Bissexto!");
        } else {
            System.out.println("Não bissexto.");
        }
    }
}
