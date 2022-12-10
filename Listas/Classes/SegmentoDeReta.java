package Classes;

public class SegmentoDeReta {
    private Ponto pontoIni;
    private Ponto pontoFin;
    private double dimensao;

    public SegmentoDeReta(Ponto pI, Ponto pF){
        this.pontoIni = pI;
        this.pontoFin = pF;
        this.dimensao = SegmentoDeReta.calculaDimensao(pI, pF);
    }

    public static double calculaDimensao(Ponto p1, Ponto p2){
        return Ponto.distance(p1, p2);
    }

    public String imprimeSegmento(){
        return "A reta começa em: " + pontoIni.toString() + "\nTemina em: " + pontoFin.toString() + "\nE tem dimensão: " + dimensao; 
    }
}
