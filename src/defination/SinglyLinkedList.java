package defination;

import adt.SinglyLinkedListADT;

public class SinglyLinkedList<E> implements SinglyLinkedListADT<E> {

    @Override
    public void add(E item) {

    }

    @Override
    public E remove(E item) {
        return null;
    }

    @Override
    public int search(E item) {
        return 0;
    }

    @Override
    public void print() {

    }

    private static class Node<E> {
        private E data;
        private Node<E> next;

    }
}
