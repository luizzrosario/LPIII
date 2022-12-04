package Q1;

import Classes.Data;
import Classes.Time;

public class DataHora {
    private Data data;
    private Time tempo;

    public DataHora(int dia, int mes, int ano, int h, int m, int s){
        data = new Data(dia, mes, ano);
        tempo = new Time(h, m, s);
    }

    public Data getData() {
        return data;
    }

    public Time getTempo() {
        return tempo;
    }

    public int getDia(){
        return data.getDia();
    }

    public int getMes(){
        return data.getMes();
    }

    public int getAno(){
        return data.getAno();
    }

    public int getHora(){
        return tempo.getHora();
    }

    public int getMin(){
        return tempo.getMin();
    }

    public int getSeg(){
        return tempo.getSeg();
    }

    public void imprimirDataHora(){
        System.out.println(data.imprimirDataS());
        tempo.imprimirTempo();
    }

    public boolean isEqual(DataHora outro){
        if((this.getAno() == outro.getAno() && this.getMes() == outro.getMes() && this.getDia() == outro.getDia()) &&
        (this.getHora() == outro.getHora() && this.getMin() == outro.getMin() && this.getSeg() == outro.getSeg())){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isGreater(DataHora outro){
        int t1 = Time.timeInInt(tempo) + (Data.dataInInt(data)* 86400); //86400 é 1 dia em segundos
        int t2 = Time.timeInInt(outro.tempo) + (Data.dataInInt(outro.data)* 86400);

        if(t1 > t2){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isLower(DataHora outro){
        int t1 = Time.timeInInt(tempo) + (Data.dataInInt(data)* 86400); //86400 é 1 dia em segundos
        int t2 = Time.timeInInt(outro.tempo) + (Data.dataInInt(outro.data)* 86400);

        if(t1 < t2){
            return true;
        }
        else{
            return false;
        }
    }
 
}
