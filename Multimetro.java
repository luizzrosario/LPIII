import java.util.Scanner;

public class Multimetro {
    public static void main(String[] arqs) {
        int QTN = 0, i = 0;
        float medidas[] = new float[10];
        float soma = 0;
        float media = 0;
        float diferenca = 0;

        System.out.println("Digite a quantia de medidas:");
        Scanner quantia = new Scanner(System.in);
        QTN = quantia.nextInt();
        quantia.close();

        for (i = 0; i < QTN; i++) {
            System.out.println("Fale a medida numero " + i);
            Scanner leitor = new Scanner(System.in);
            medidas[i] = leitor.nextFloat();
            leitor.close();
            System.out.println("leu isso aqui: " + medidas[i]);
            soma += medidas[i];
        }

        media = soma / QTN;

        for (i = 0; i < QTN; i++) {
            diferenca = medidas[i] - media;

            if (diferenca < 0) {
                diferenca = diferenca * (-1);
            }

            if (diferenca > media / 10) {
                System.out.println("O valor de numero " + i + " num funciona não man");
            } else {
                System.out.println("O valor de numero " + i + " está ok");
            }
        }

        System.out.println("A media é essa aqui: " + media);

    }
}