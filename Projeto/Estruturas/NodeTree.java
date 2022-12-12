package Projeto.Estruturas;

public class NodeTree<T> {
    T data; // conteúdo
    NodeTree<T> father; //pai
    NodeTree<T> left; //filho esquerdo
    NodeTree<T> right; //filho direito

    // construtor
    public NodeTree(){
        this.data = null;
        this.father = null;
        this.left = null;
        this.right = null;
    }
}
