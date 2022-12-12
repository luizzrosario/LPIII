package Projeto.Estruturas;

public interface ListInterface<T> {
    T removeFront();
    T removeRear();
    T removeInPosition(int position);
    T removeItem(T d);
    void printList();
}
