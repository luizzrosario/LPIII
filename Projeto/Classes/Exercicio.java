package Projeto.Classes;

public class Exercicio implements Comparable<Exercicio> {
    private String nomeExercicio;
    private int sets;
    private int reps;
    private double peso;
    private Maquina maquina;

    public Exercicio(Maquina m, String ne, int sets, int reps, double peso) {
        this.maquina = new Maquina(m);
        this.nomeExercicio = ne;
        this.sets = sets;
        this.reps = reps;
        this.peso = peso;
    }

    public String getNomeExercicio() {
        return this.nomeExercicio;
    }

    public int getSets() {
        return this.sets;
    }

    public int getReps() {
        return this.reps;
    }

    public double getPeso() {
        return this.peso;
    }

    public Maquina getMaquina() {
        return this.maquina;
    }

    @Override
    public int compareTo(Exercicio ex) {
        return this.maquina.compareTo(ex.getMaquina());
    }

    @Override
    public String toString() {
        return maquina.toString() + this.nomeExercicio + " | Sets: " + this.sets + " - Reps: " + this.reps + " - Peso (kg): " + this.peso;
    }
}
