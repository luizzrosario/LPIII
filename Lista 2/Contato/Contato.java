package Contato;

import Date.Data;

public class Contato {
    String nome, email;
    int telefone;
    Data dataNascimento = new Data();

    public void intializeContato() {
        setNome(" ");
        setTelefone(0);
        setEmail(" ");
        dataNascimento.intializeData();
    }

    public String getNome() {
        return nome;
    }

    public Data getDataNascimento() {
        return dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;

    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void setDataNascimento(Data dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContato(String nome, int telefone, String email, Data data) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        dataNascimento.setData(data.getDia(), data.getMes(), data.getAno());
    }

    public void imprimirContato() {
        System.out.println("Nome: " + nome + "\nTelefone: " + telefone + "\nEmail: " + email + "\nData de Nascimento:"
                + dataNascimento.imprimirDataS());
    }

    public int calcularIdade(Data hoje) {
        int idade = 0;

        int dia = hoje.getDia();
        int mes = hoje.getMes();
        int ano = hoje.getAno();

        int hojeInt = (dia + (mes * 30) + (ano * 365));

        int dataNascimentoInt = (dataNascimento.getDia() + (dataNascimento.getMes() * 30)
                + (dataNascimento.getAno() * 365));

        int idadeInt = hojeInt - dataNascimentoInt;

        idade = (idadeInt / 365);

        return idade;
    }
}
