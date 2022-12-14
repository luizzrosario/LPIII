package Projeto.Estruturas;

// Nó genérico
public class Node<T> {
    public T data; // T é o dado genérico no nó
    public Node<T> next;
    public Node<T> prev;

    // Construtor
    public Node(T data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
