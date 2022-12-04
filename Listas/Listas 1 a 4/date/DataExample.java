package date;

public class DataExample {
    public static void main(String[] args) {
        Data data1 = new Data();
        Data data2 = new Data();
        Data data3 = new Data();
        String dataTemp;
        int dias;

        // imprimindo iniciado
        data1.intializeData();
        dataTemp = data1.imprimirData();
        System.out.println(dataTemp);

        // tentando iniciar uma data já iniciada
        data1.intializeData();

        // setando um valor específico na data
        data1.setData(22, 9, 2003);
        dataTemp = data1.imprimirData();
        System.out.println(dataTemp);

        // imprimindo em string o mês
        dataTemp = data1.imprimirDataS();
        System.out.println(dataTemp);

        // usando com construtor (não passa pror verificação)
        data2.setData(14, 5, 1800);

        // vendo se é anterior
        if (data1.isPrevious(data2)) {
            System.out.println("É antes");
        }

        // data com construtor ussando outra data
        // data3.dataWithConstructor(); (outra alternativa)
        data3.setData(data2);;
        dataTemp = data3.imprimirData();
        System.out.println(dataTemp);

        dias = data1.howManyDays(data2);
        System.out.println("Quantos dias (objeto Data): "+dias);

        dias = data1.howManyDays(22, 9, 2000);
        System.out.println("Quantos dias (3 int): "+dias);
    }
}
