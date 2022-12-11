package Classes;

public class LivroBiblioteca extends Livro {
    private boolean emprestado;
    private Data devolucaoData;

    public LivroBiblioteca(String t, String a, int ano, int pag) {
        super(t, a, ano, pag);
        this.emprestado = false;
    }

    public LivroBiblioteca(Livro livro) {
        super(livro);
        this.emprestado = false;
    }

    public void borrow(Data data) {
        if (!emprestado) {
            this.devolucaoData = new Data(data);
            this.emprestado = true;
        } else {
            System.out.println("Já foi emprestado!");
        }
    }

    public void giveBack() {
        this.emprestado = false;
    }

    @Override
    public String toString() {
        String string = "";
        if (emprestado) {
            string = "\nDia de Devolução: " + devolucaoData.imprimirData();
        }
        return super.toString() + "\n" + this.isAvailable() + string;
    }

    public String isAvailable() {
        if (emprestado) {
            return "Não está disponível.";
        }
        return "Está disponível.";
    }

}
