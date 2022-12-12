package Projeto.Estruturas;

//Lista encadeada genérica
public class List<T extends Comparable<T>> implements ListInterface<T> {
    private int size = 0; // tamanho da lista
    private Node<T> head; // primeiro item
    private Node<T> tail; // ultimo item

    // construtor da lista
    public List() {
        this.head = null;
        this.tail = null;
    }

    // pegar tamanho da lista
    public int getSizeList() {
        return this.size;
    }

    // Seta um item como primeiro
    public void setFrontList(T data) {
        T d = data;
        d = data;
        insertFront(d);
    }

    // Seta um item como ultimo
    public void setRearList(T data) {
        T d = data;
        insertRear(d);
    }

    // Inserir em qualquer posição da lista
    public void setInPositionList(T data, int position) {
        T d = data;
        insertInPosition(d, position);
    }

    // Insere um itm no começo da lista
    private void insertFront(T data) {
        Node<T> newNode = new Node<T>(data);

        // Caso lista vazia
        if (this.head == null) {
            head = newNode;
            tail = newNode;
            size++;
        }
        // Caso tenha item na lista
        else {
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            head = newNode;
            size++;
        }
    }

    // Inserir em ultimo
    private void insertRear(T data) {
        Node<T> newNode = new Node<T>(data);

        // caso lista vazia
        if (this.head == null) {
            head = newNode;
            tail = newNode;
            size++;
        }
        // Com item na lista
        else {
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }

    // Inserir em uma posição específica
    private void insertInPosition(T data, int position) {
        // se a posição estiver fora do tamanho da lista
        if ((position > this.size) || (position < 1)) {
            System.out.printf("\nPosição inválida!\n");
            return;
        }

        // se for logo no primeiro slot
        if (position == 1) {
            insertFront(data);
            return;
        }
        // se for no ultimo slot
        else if (position == size) {
            insertRear(data);
            return;
        }
        // outra posição
        else {
            Node<T> newNode = new Node<T>(data);
            Node<T> aux = head;

            for (int i = 1; i < (position - 1); i++) {
                aux = aux.next;
            }

            newNode.next = aux.next;
            newNode.prev = aux;
            aux.next.prev = newNode;
            aux.next = newNode;
            size++;
        }
    }

    // remove primeiro
    @Override
    public T removeFront() {
        if (head == null) {
            System.out.println("Lista vazia!");
            System.exit(-1);
        }

        T temp = head.data;

        // só 1 na lista
        if (head == tail) {
            head = null;
            tail = null;
            size = 0;
            return temp;
        } else {
            Node<T> aux = head;
            head = aux.next;
            head.prev = tail;
            tail.next = head;
            aux = null;
            size--;
            return temp;
        }
    }

    // remove ultimo
    @Override
    public T removeRear() {
        if (head == null) {
            System.out.println("Lista vazia!");
            System.exit(-1);
        }

        T temp = tail.data;

        // se só tiver 1 na lista
        if (head == tail) {
            head = null;
            tail = null;
            size = 0;
            return temp;
        } else {
            Node<T> aux = tail;

            tail = aux.prev;
            tail.next = head;
            head.prev = tail;
            aux = null;
            size--;
            return temp;
        }
    }

    // remove item na posição dita
    @Override
    public T removeInPosition(int position) {
        if (head == null) {
            System.out.println("Lista vazia");
            System.exit(-1);
        }

        if ((position > size) || (position < 1)) {
            System.out.println("Posição inválida!");
            System.exit(-1);
        }

        if (position == 1) {
            return removeFront();
        } else if (position == size) {
            return removeRear();
        } else {
            Node<T> aux = head;

            for (int i = 1; i < position; i++) {
                aux = aux.next;
            }
            T temp = aux.data;

            aux.prev.next = aux.next;
            aux.next.prev = aux.prev;
            aux = null;
            size--;
            return temp;
        }
    }

    // remove um item específico
    @Override
    public T removeItem(T d) {
        Node<T> item = findNode(head, d);

        if ((getSizeList() == 1) || item == head) {
            return removeFront();
        } else if (item == tail) {
            return removeRear();
        } else {
            T temp = item.data;
            item.prev.next = item.next;
            item.next.prev = item.prev;
            item = null;
            size--;
            return temp;
        }
    }

    // Procura nó na lista (recursivo)
    private Node<T> findNode(Node<T> node, T d) {
        if (node.data.compareTo(d) == 0) {
            return node;
        }
        if (node == this.tail) {
            System.out.println("Não foi encontrado!");
            System.exit(-1);
        }

        return findNode(node.next, d);
    }

    // Imprime nó
    private void printNode(Node<T> h1, Node<T> h2) {
        if (h1.next == h2) {
            System.out.println(h1.data.toString());
            return;
        }
        System.out.println(h1.data.toString());
        printNode(h1.next, h2);
    }

    // Imprime lista
    public void printList() {
        if (head == null) {
            System.out.println("Lista vazia!");
            System.exit(-1);
        }
        printNode(this.head, this.head);
    }

    public String toString(){
        if(head == null)
          return "Lista vazia!!";
        else{
          Node<T> currentNode = this.head;
          String list = "";
          while(currentNode.next != null){
            list += currentNode + "\n";
            currentNode = currentNode.next;
          }
          list += currentNode;
          return list;
        }
      }
}
