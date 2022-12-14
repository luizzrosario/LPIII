package Projeto.Classes;

import Projeto.Estruturas.Tree;

// Classe Academia
public class Academia {
    // Atributos basicos
    private String nome;
    Tree<Aluno> alunos;
    Tree<Maquina> maquinas;

    // Construtores
    public Academia(String nome) {
        this.alunos = new Tree<Aluno>();
        this.maquinas = new Tree<Maquina>();
        this.nome = nome;
    }

    public Academia() {
        this.alunos = new Tree<Aluno>();
        this.maquinas = new Tree<Maquina>();
        this.nome = "Sem nome";
    }

    // Muda o Nome da academia
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Adiciona o aluno
    public void addAluno(Aluno a) {
        alunos.insertTree(a);
    }

    // Sobrecarga de addAluno
    public void addAluno(String nome, int cpf, String email, int telefone) {
        Aluno a = new Aluno(nome, cpf, email, telefone);
        alunos.insertTree(a);
    }

    // Adiciona maquia
    public void addMaquina(Maquina m) {
        maquinas.insertTree(m);
    }

    // Sobrecarga de addMaquina
    public void addMaquina(String nome, int id, int tipo) {
        Maquina m = new Maquina(nome, id, tipo);
        maquinas.insertTree(m);
    }

    // Printa todos os alunos
    public void printAlunos() {
        alunos.printTreeAll();
    }

    // Printa todas as maquinas
    public void printMaquinas() {
        maquinas.printTreeAll();
    }

    // Remove aluno
    public void removeAluno(Aluno a) {
        alunos.removeNode(a);
    }

    public void removeAluno(int cpf) {
        Aluno a = new Aluno("temp", cpf);
        alunos.removeNode(a);
    }
    
    // Remove maquina
    public void removeMaquina(Maquina m) {
        maquinas.removeNode(m);
    }

    public void removeMaquina(int id) {
        Maquina m = new Maquina("temp", id, 0);
        maquinas.removeNode(m);
    }

    // Pega aluno usando CPF
    public Aluno getAluno(int cpf) {
        Aluno a = new Aluno("temp", cpf);
        return alunos.findNodeID(a);
    }

    // Pega maquina usando ID
    public Maquina getMaquina(int id) {
        Maquina m = new Maquina("temp", id, 0);
        return maquinas.findNodeID(m);
    }

    public void printTreinos(int cpf){
        getAluno(cpf).printTreinos();
    }

    public void printTreino(int cpf, int treino){
        getAluno(cpf).printTreino(treino);
    }

    // toString para informações básicas da academia
    public String toString() {
        return "@===" + this.nome.toUpperCase() + "===@" + "\nAlunos incritos: " + alunos.getSizeTree()
                + "\nQuantia de máquinas: " + maquinas.getSizeTree();
    }
}
