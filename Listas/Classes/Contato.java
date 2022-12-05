package Classes;

public class Contato {
    private String nome, email;
    private int telefone;
    private Data dataNascimento;
    private static int contador = 0;

    public Contato(String nome, int telefone, String email, int dia, int mes, int ano) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.dataNascimento = new Data(dia, mes, ano);
        contador++;
    }

    public Contato(String nome, int telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.dataNascimento = new Data();
        contador++;
    }

    public Contato() {
        setNome(" ");
        setTelefone(0);
        setEmail(" ");
        dataNascimento.intializeData();
        contador++;
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

    public void imprimirContato() {
        System.out.println("Nome: " + nome + "\nTelefone: " + telefone + "\nEmail: " + email + "\nData de Nascimento:"
                + dataNascimento.imprimirDataS() + "\nContatos da agenda: " + contador);
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

    public static void imprimirContagem() {
        System.out.println("Numero de contatos na agenda: " + contador);
    }

}
