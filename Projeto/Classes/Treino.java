package Projeto.Classes;

import Projeto.Estruturas.Queue;

public class Treino {
    private String nomeDoTreino;
    Queue<Exercicio> treino = new Queue<Exercicio>();

    // construtor
    public Treino(String n) {
        this.nomeDoTreino = n;
    }

    // Adiciona exercicio com um exercicio
    public void addExercicio(Exercicio e) {
        treino.enqueue(e);
    }

    // add com uma maquina + um novo exercício
    public void addExercicio(Maquina m1, int id, String n, int s, int r) {
        Exercicio e = new Exercicio(m1, id, n, s, r);
        treino.enqueue(e);
    }

    // add com todos os dados
    public void addExercicio(String nMaq, int idMaq, String tipo, int id, String n, int s, int r) {
        Maquina m1 = new Maquina(nMaq, idMaq, tipo);
        Exercicio e = new Exercicio(m1, id, n, s, r);
        treino.enqueue(e);
    }

    public void removeExercicio(int i) {
        treino.removeInPosition(i);
    }

    public void printTreino(){
        treino.printList();
    }
}
