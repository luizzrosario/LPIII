package Projeto.Classes;

public class Maquina{
    private String nome;
    private int numero;
    private String tipo;

    public Maquina(String nome, int numero, String tipo) {
        this.nome = nome;
        this.numero = numero;
        this.tipo = tipo;
    }

    public Maquina(Maquina m){
        this.nome = m.getNome();
        this.numero = m.getNumero();
        this.tipo = m.getTipo();
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    // 0 para igual, -1 para maior e 1 para menor
    public int compareTo(Maquina maquina) {
        if (maquina.getNumero() == this.numero) {
            return 0;
        } else if (maquina.getNumero() < this.numero) {
            return -1;
        } else {
            return 1;
        }
    }

    public String toString(){
        return this.numero + " - " + this.nome + " || ";
    }
}
