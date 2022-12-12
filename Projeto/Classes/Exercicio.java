package Projeto.Classes;

public class Exercicio extends Maquina implements Comparable<Exercicio> {
    private int idExercicio;
    private String nomeExercicio;
    private int sets;
    private int reps;

    public Exercicio(Maquina m, int id, String ne, int sets, int reps) {
        super(m);
        this.idExercicio = id;
        this.nomeExercicio = ne;
        this.sets = sets;
        this.reps = reps;
    }

    public int getIdExercicio() {
        return idExercicio;
    }

    public String getNomeExercicio() {
        return nomeExercicio;
    }

    public int getSets() {
        return sets;
    }

    public int getReps() {
        return reps;
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
        return super.toString() + this.nomeExercicio + " || Sets: " + this.sets + " Reps: " + this.reps;
    }
}
