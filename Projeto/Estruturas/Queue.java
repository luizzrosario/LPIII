package Projeto.Estruturas;

// Fila genérica herdada da lista encadeada
public class Queue<T extends Comparable<T>> extends List<T> {

    //Construtores
    public Queue(T data){
        setRearList(data);
    }

    public Queue(){
        super();
    }

    // coloca um na fila
    public void enqueue(T data){
        setRearList(data);
    }

    // faz a fila andar (tira o da frente)
    public T dequeue(){
        if(getSizeList() == 0){
            System.out.println("Lista vazia!");
            System.exit(-1);
        }
        return removeFront();
    }

    @Override
    public String toString(){
        return super.toString();
    }
}
