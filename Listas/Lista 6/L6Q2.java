import Classes.Data;
import Classes.DataHoraAgregacaoAssociacao;
import Classes.Time;

public class L6Q2{
    public static void main(String[] args) {
        Data data1 = new Data(22, 9, 2003);
        Time tempo1 = new Time(19, 0, 0);
        DataHoraAgregacaoAssociacao dataHora1 = new DataHoraAgregacaoAssociacao(data1, tempo1, "nascimento");

        dataHora1.imprimirDataHora();
    }
}