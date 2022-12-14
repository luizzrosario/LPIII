package Projeto.Classes;

import Projeto.Estruturas.Tree;

// com alunos 
// com maquinas
public class Academia {
    private String nome;
    Tree<Aluno> alunos;
    Tree<Maquina> maquinas;

    public Academia(String nome) {
        this.alunos = new Tree<Aluno>();
        this.nome = nome;
    }

    public void addAluno(Aluno a) {
        alunos.insertTree(a);
    }

    public void printAlunos() {
        alunos.printTreeAll();
    }

    public String toString() {
        return "@===" + this.nome.toUpperCase() + "===@" + "\nAlunos incritos: " + alunos.getSizeTree()
                + "\nQuantia de máquinas: ";
    }
}
