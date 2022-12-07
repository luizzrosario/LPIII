import Classes.Data;
import Classes.DataHoraAgregacaoAssociacao;
import Classes.Time;

public class L6Q3 {
    public static void main(String[] args) {
        Data data = new Data(22, 9, 2003);
        Time tempo = new Time(19);
        DataHoraAgregacaoAssociacao DataHora = new DataHoraAgregacaoAssociacao(data, tempo, "Nascimento");

        System.out.println(DataHora.imprimirDataHoraAssociacao() + "\n" + data.imprimirDataS());
        tempo.imprimirTempo();
    }
}
