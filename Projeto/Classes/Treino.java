package Projeto.Classes;

import Projeto.Estruturas.Queue;

public class Treino {
    private String nomeDoTreino;
    Queue<Exercicio> treino = new Queue<Exercicio>();
    private int contagem = 0;

    // construtor
    public Treino(String n) {
        this.nomeDoTreino = n;
    }

    // Adiciona exercicio com um exercicio
    public void addExercicio(Exercicio e) {
        treino.enqueue(e);
        contagem++;
    }

    // add com uma maquina + um novo exercício
    public void addExercicio(Maquina m1, int id, String n, int s, int r, double p) {
        Exercicio e = new Exercicio(m1, id, n, s, r, p);
        treino.enqueue(e);
        contagem++;
    }

    // add com todos os dados
    public void addExercicio(String nMaq, int idMaq, String tipo, int id, String n, int s, int r, double p) {
        Maquina m1 = new Maquina(nMaq, idMaq, tipo);
        Exercicio e = new Exercicio(m1, id, n, s, r, p);
        treino.enqueue(e);
        contagem++;
    }

    public Exercicio removeExercicio(Exercicio d) {
        contagem--;
        return treino.removeItem(d);
    }

    public Exercicio removeExercicio(int i){
        contagem--;
        return treino.removeInPosition(i);
    }

    public double calculaVolume(){
        Exercicio temp;
        double volume = 0;
        for(int i = 1; i <= contagem; i++){
            temp = treino.dequeue();
            volume += temp.getReps() * temp.getSets() * temp.getPeso();
            System.out.println(volume);
            treino.enqueue(temp);
        }
        return volume;
    }

    public void printTreino(){
        System.out.println("Treino: " + nomeDoTreino + " Volume total: " + calculaVolume());
        treino.printList();
    }
}
