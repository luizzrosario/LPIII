public class DataExample {
    public static void main(String[] args) {
        Data data1 = new Data();
        String dataTemp;

        data1.setData(22, 9, 2003);

        dataTemp = data1.imprimirData();

        System.out.println(dataTemp);

        dataTemp = data1.imprimirDataS();

        System.out.println(dataTemp);

    }
}
