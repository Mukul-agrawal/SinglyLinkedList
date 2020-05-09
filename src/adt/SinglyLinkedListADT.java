package adt;

public interface SinglyLinkedListADT<E> {
    void add(E item);

    E remove();

    int search(E item);

    void print();
}
