package Classes;

public class Agendamento {
    private Contato contato;
    private Data data;
    private Time hora;

    public Agendamento(String nome, int telefone, String email, int diaN, int mesN, int anoN, int dia, int mes, int ano,
            int h, int m, int s) {
        this.contato = new Contato(nome, telefone, email, diaN, mesN, anoN);
        this.data = new Data(dia, mes, ano);
        this.hora = new Time(h, m, s);
    }

    public void imprimirConsulta() {
        contato.imprimirContato();
        System.out.println(data.imprimirDataS());
        hora.imprimirTempo();
    }
}
