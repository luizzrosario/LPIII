package Contato;

import Date.Data;

public class ContatoExample {
    public static void main(String[] args) {
        Contato contato1 = new Contato();
        Data data1 = new Data();
        Data data2 = new Data();

        data1.setData(22, 9, 2003);
        data2.setData(10, 11, 2022);

        System.out.println();
        System.out.println("@===Contato Inicializado===@");
        contato1.intializeContato();
        contato1.imprimirContato();

        System.out.println();
        System.out.println("@===Contato Definindo===@");
        contato1.setContato("Luiz", 988376003, "luiz@gmail.com", data1);
        contato1.imprimirContato();

        System.out.println();
        System.out.println("@===Idade do Contato===@");
        int idade = contato1.calcularIdade(data2);
        System.out.println("Idade do contato:" + idade);
        System.out.println();
    }
}