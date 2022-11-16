package Listas.Date;

public class DataExample {
    public static void main(String[] args) {
        Data data1 = new Data();
        Data data2 = new Data();
        Data data3 = new Data();
        String dataTemp;

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
        data2.dataWithConstructor(14, 5, 1800);

        // vendo se é anterior
        if (data1.isPrevious(data2)) {
            System.out.println("É antes");
        }

        // data com construtor ussando outra data
        // data3.dataWithConstructor(); (outra alternativa)
        data3.dataWithConstructor(data2);
        dataTemp = data3.imprimirData();
        System.out.println(dataTemp);
    }
}
