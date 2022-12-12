package Projeto.Estruturas;

public class Node <T> {
    public T data; //T é o dado genérico no nó
    public Node<T> next;
    public Node<T> prev;

    // construtor
    public Node(T data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
