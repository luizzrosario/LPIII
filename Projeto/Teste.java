package Projeto;

import Projeto.Classes.Academia;
import Projeto.Classes.Aluno;
import Projeto.Classes.Exercicio;
import Projeto.Classes.Maquina;
import Projeto.Classes.Treino;

public class Teste {
    public static void main(String[] args) {
        Treino t1 = new Treino("A");
        Treino t2 = new Treino("B");
        Treino t3 = new Treino("C");
        Treino t4 = new Treino("D");
        Maquina m1 = new Maquina("Legpress", 1, 1);
        Maquina m2 = new Maquina("Legpress", 2, 1);
        Maquina m3 = new Maquina("Legpress", 3, 1);
        Maquina m4 = new Maquina("Legpress", 4, 1);
        Exercicio e1 = new Exercicio(m1, "Leg", 10, 10, 100);
        Exercicio e2 = new Exercicio(m2, "perna", 10, 10, 100);
        Exercicio e3 = new Exercicio(m3, "pierna", 10, 10, 100);
        Exercicio e4 = new Exercicio(m4, "suehasue", 10, 10, 100);
        Aluno a = new Aluno("Luiz", 1234, "luiz@gmail.com", 123);
        Aluno b = new Aluno("bruno", 1235, "luiz@gmail.com", 123);
        Aluno c = new Aluno("carlos", 1236, "luiz@gmail.com", 123);
        Aluno d = new Aluno("danilo", 1237, "luiz@gmail.com", 123);

        t1.addExercicio(e1);
        t1.addExercicio(e3);
        t1.addExercicio(e2);
        t1.addExercicio(e4);

        t2.addExercicio(e4);
        t2.addExercicio(e2);
        t2.addExercicio(e3);
        t2.addExercicio(e1);

        t3.addExercicio(e2);
        t3.addExercicio(e2);
        t3.addExercicio(e3);
        t3.addExercicio(e1);

        t4.addExercicio(e1);
        t4.addExercicio(e2);
        t4.addExercicio(e3);
        t4.addExercicio(e4);

        a.addTreino(t1);
        a.addTreino(t2);
        a.addTreino(t3);
        a.addTreino(t4);
        a.printTreinos();

        Academia academia = new Academia("Ela mesmo");
        academia.addAluno(a);
        academia.addAluno(b);
        academia.addAluno(c);
        academia.addAluno(d);
        System.out.println();
        academia.printAlunos();
        System.out.println();

        academia.removeAluno(b);
        academia.printAlunos();
        System.out.println();
        academia.removeAluno(d);
        academia.printAlunos();
        System.out.println();

        academia.addMaquina(m1);
        academia.addMaquina(m2);
        academia.addMaquina(m3);
        academia.addMaquina(m4);
        academia.printMaquinas();

        System.out.println(academia.toString());
    }
}
