package Projeto.Classes;

import Projeto.Estruturas.List;

// com treinos
public class Aluno implements Comparable<Aluno>{
    private String nome;
    private String email;
    private int cpf;
    private int telefone;
    private static int contagem = 0;
    private int contagemTreino = 0;
    private List<Treino> treinos = new List<Treino>();

    public Aluno(String nome, String email, int cpf, int telefone) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.telefone = telefone;
        contagem++;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getCpf() {
        return cpf;
    }

    public int getTelefone() {
        return telefone;
    }

    public static int getContagem() {
        return contagem;
    }

    public int getContagemTreino() {
        return contagemTreino;
    }

    // adiciona um treino ao aluno
    public void addTreino(Treino t) {
        treinos.setRearList(t);
    }

    // printa todos os treinos
    public void printTreinos() {
        for (int i = 0; i < (contagem + 1); i++) {
            treinos.printList();
        }
    }

    // printa treino específico
    public void printTreino(int i) {
        Treino temp;
        temp = treinos.removeInPosition(i);
        temp.printTreino();
        treinos.setInPositionList(temp, i);
    }

    // comparable do aluno
    @Override
    public int compareTo(Aluno a){
        if(this.cpf == a.getCpf()){
            return 0;
        }
        else if(this.cpf < a.getCpf()){
            return -1;
        }else{
            return 1;
        }
    }

    public String toString(){
        return "Nome: " + this.nome + " | CPF: " + this.cpf + " | Telefone: " + this.telefone + " | Email: " + this.email;
    }
}
