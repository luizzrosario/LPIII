package Projeto.Classes;

// com treinos
public class Aluno {
    private String nome;
    private String email;
    private int matricula;
    private int cpf;
    private int telefone;
    private static int contagem = 0;
    private Treino treinos[];
    private int contagemTreino = 0;

    public Aluno(String nome, String email, int matricula, int cpf, int telefone) {
        this.nome = nome;
        this.email = email;
        this.matricula = matricula;
        this.cpf = cpf;
        this.telefone = telefone;
        contagem++;
    }

    

    public static int getContagem() {
        return contagem;
    }

    public void novoTreino(Treino t) {
        treinos[contagem] = t;
    }

    // printa todos os treinos
    public void printTreinos() {
        for (int i = 0; i < (contagem + 1); i++) {
            treinos[i].printTreino();
        }
    }

    // printa treino específico
    public void printTreino(int i) {
        treinos[i].printTreino();
    }

}
