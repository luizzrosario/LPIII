package Projeto.Estruturas;

// Arvore binária
public class Tree<T extends Comparable<T>> {
    private NodeTree<T> root;
    private int size;

    // construtores
    public Tree() {
        root = null;
    }

    public Tree(T data) {
        insertTree(data);
    }

    // Retorna tamanho da arvore
    public int getSizeTree() {
        return this.size;
    }

    // Cria nó na arvore
    private NodeTree<T> createNode(NodeTree<T> node, T i) {
        node.data = i;
        node.father = null;
        node.left = null;
        node.right = null;
        size++;
        return node;
    }

    // Insere um ojeto na arvore
    public void insertTree(T i) {
        if (root == null) {
            NodeTree<T> newNode = new NodeTree<T>();
            newNode = createNode(newNode, i);
            root = newNode;
        } else {
            if (i.compareTo(root.data) == -1) {
                insertLeft(root, i);
            } else if (i.compareTo(root.data) == 1) {
                insertRight(root, i);
            }
        }
    }

    // inserir a esquerda
    private void insertLeft(NodeTree<T> node, T i) {
        if (node.left == null) {
            NodeTree<T> newNode = new NodeTree<T>();
            newNode = createNode(newNode, i);
            newNode.data = i;
            node.left = newNode;
            newNode.father = node;
            return;
        } else {
            if (i.compareTo(node.left.data) == -1) {
                insertLeft(node.left, i);
            } else if (i.compareTo(node.left.data) == 1) {
                insertRight(node.left, i);
            }
        }
    }

    // inserir a direita
    private void insertRight(NodeTree<T> node, T i) {
        if (node.right == null) {
            NodeTree<T> newNode = new NodeTree<T>();
            newNode = createNode(newNode, i);
            newNode.data = i;
            node.right = newNode;
            newNode.father = node;
            return;
        } else {
            if (i.compareTo(node.right.data) == 1) {
                insertRight(node.right, i);
            } else if (i.compareTo(node.right.data) == -1) {
                insertLeft(node.right, i);
            }
        }
    }

    // imprime arvore
    public void printTreeAll() {
        printTree(root);
    }

    // imprime os nós em ordem
    private void printTree(NodeTree<T> root) {
        if (root != null) {
            printTree(root.left);
            System.out.println(root.data.toString());
            printTree(root.right);
        }
    }
}
