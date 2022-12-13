package Projeto.Classes;

public class Exercicio extends Maquina implements Comparable<Exercicio> {
    private int idExercicio;
    private String nomeExercicio;
    private int sets;
    private int reps;
    private double peso;

    public Exercicio(Maquina m, int id, String ne, int sets, int reps, double peso) {
        super(m);
        this.idExercicio = id;
        this.nomeExercicio = ne;
        this.sets = sets;
        this.reps = reps;
        this.peso = peso;

    }

    public int getIdExercicio() {
        return this.idExercicio;
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

    @Override
    public int compareTo(Exercicio ex) {
        if (this.idExercicio == ex.getIdExercicio()) {
            return 0;
        } else if (ex.getIdExercicio() < idExercicio) {
            return -1;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return super.toString() + this.nomeExercicio + " | Sets: " + this.sets + " - Reps: " + this.reps + " - Peso (kg): " + this.peso;
    }
}
