package Projeto.Classes;

// Classe Maquina comparável
public class Maquina implements Comparable<Maquina> {
    // Atributos
    private String nome;
    private int id;
    private int tipo;

    // Construtores
    public Maquina(String nome, int id, int tipo) {
        this.nome = nome;
        this.id = id;
        this.tipo = tipo;
    }

    public Maquina(Maquina m) {
        this.nome = m.getNome();
        this.id = m.getId();
        this.tipo = m.getTipo();
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public int getTipo() {
        return tipo;
    }

    // Compare maquina
    public int compareTo(Maquina maquina) {
        if (maquina.getId() == this.id) {
            return 0;
        } else if (maquina.getId() > this.id) {
            return -1;
        } else {
            return 1;
        }
    }

    // toString maquina
    public String toString() {
        return this.id + " - " + this.nome;
    }
}
