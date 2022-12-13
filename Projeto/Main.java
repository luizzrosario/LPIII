package Projeto;

import Projeto.Classes.Exercicio;
import Projeto.Classes.Maquina;
import Projeto.Classes.Treino;
//import Projeto.Estruturas.List;
//import Projeto.Estruturas.Queue;

public class Main {
    public static void main(String[] args) {
        //Queue<String> treino = new Queue<String>();
        Treino treinoTreino = new Treino("A");
        
        Maquina m1 = new Maquina("Supino reto", 1, "peito");
        Maquina m2 = new Maquina("Raque agachamento", 2, "perna");
        Maquina m3 = new Maquina("Halteres", 3, "Livre");
        Maquina m4 = new Maquina("Peckdeck", 4, "peito");
        
        Exercicio e1 = new Exercicio(m1, 1, "Supino reto", 4, 12, 25);
        Exercicio e2 = new Exercicio(m2, 2, "Agachamento", 4, 10, 120);
        Exercicio e3 = new Exercicio(m3, 3, "Elevação lateral", 5, 20, 12.5);
        Exercicio e4 = new Exercicio(m4, 4, "Posterior de ombro", 4, 15, 12.5);
        
        /* 
        Queue<Exercicio> treinoQueue = new Queue<Exercicio>();
        
        treinoQueue.enqueue(e1);
        treinoQueue.enqueue(e2);
        treinoQueue.enqueue(e3);
        treinoQueue.enqueue(e4);

        treinoQueue.printList();
        */

        treinoTreino.addExercicio(e1);
        treinoTreino.addExercicio(e2);
        treinoTreino.addExercicio(e3);
        treinoTreino.addExercicio(e4);

        treinoTreino.printTreino();

        treinoTreino.removeExercicio(e1);

        treinoTreino.printTreino();

        treinoTreino.removeExercicio(1);
        treinoTreino.printTreino();
        /* 
        exercícios.enqueue(e1);
        exercícios.enqueue(e2);
        exercícios.enqueue(e3);
        exercícios.enqueue(e4);

        exercícios.printList();

        treino.enqueue("Supino");
        treino.enqueue("Crucifixo");
        treino.enqueue("Rosca concentrada");

        treino.printList();
        treino.dequeue();
        treino.printList();
        treino.dequeue();
        treino.printList();
        */
    }
}
