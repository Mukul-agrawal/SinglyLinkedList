package adt;

public interface SinglyLinkedListADT<E> {
    void add(E item);

    E remove(E item);

    int search(E item);
}
