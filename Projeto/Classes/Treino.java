package Projeto.Classes;

// Utiliza fila para organizar
import Projeto.Estruturas.Queue;

// Classe treino
public class Treino {
    private String nomeDoTreino;
    private int contagem = 0;
    Queue<Exercicio> treino = new Queue<Exercicio>();

    // Construtor
    public Treino(String n) {
        this.nomeDoTreino = n;
    }

    // Adiciona exercício
    public void addExercicio(Exercicio e) {
        treino.enqueue(e);
        contagem++;
    }

    // Sobrecarga
    public void addExercicio(Maquina m1, String n, int s, int r, double p) {
        Exercicio e = new Exercicio(m1, n, s, r, p);
        treino.enqueue(e);
        contagem++;
    }

    // Sobrecarga
    public void addExercicio(String nMaq, int idMaq, int tipo, int id, String n, int s, int r, double p) {
        Maquina m1 = new Maquina(nMaq, idMaq, tipo);
        Exercicio e = new Exercicio(m1, n, s, r, p);
        treino.enqueue(e);
        contagem++;
    }

    // Remove exercício do treino
    public Exercicio removeExercicio(Exercicio d) {
        contagem--;
        return treino.removeItem(d);
    }

    // Sobrecarga pra remover a partir da posição
    public Exercicio removeExercicio(int i) {
        contagem--;
        return treino.removeInPosition(i);
    }

    // Método para calcular volume do treino
    public double calculaVolume() {
        Exercicio temp;
        double volume = 0;
        for (int i = 1; i <= contagem; i++) {
            temp = treino.dequeue();
            volume += temp.getReps() * temp.getSets() * temp.getPeso();
            treino.enqueue(temp);
        }
        return volume;
    }

    // Imprime treino
    public void printTreino() {
        System.out.println("Treino: " + nomeDoTreino + " - Volume total: " + calculaVolume());
        treino.printList();
    }
}
