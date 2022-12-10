package Classes;

public class LivroBiblioteca extends Livro {
    private boolean emprestado;
    private Data devolucaoData; 

    public LivroBiblioteca(String t, String a, int ano, int pag){
        super(t, a, ano, pag);
        this.emprestado = false;
    }
    public LivroBiblioteca(Livro livro){
        super(livro);
        this.emprestado = false;
    }

    public void borrow(Data data){
        this.devolucaoData = new Data(data);
        this.emprestado = true;
    }

    public void giveBack(){
        this.emprestado = false;
    }

    @Override
    public String toString(){
        return super.toString() +"\n"+ this.isAvailable()+ "\nDia de Devolução: "+ devolucaoData.imprimirData();
    }

    public String isAvailable(){
        if(emprestado){
            return "Não está disponível.";
        } else{
            return "Está disponível.";
        }
    }
    
}
