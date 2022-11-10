package Contato;

import Date.Data;

public class Contato {
    String nome, email;
    int telefone;
    Data dataNascimento;

    public void intializeContato() {
        dataNascimento.intializeData();
        setNome(" ");
        setTelefone(0);
        setEmail(" ");
        setDataNascimento(dataNascimento);
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
}
