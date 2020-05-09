package defination;

import adt.SinglyLinkedListADT;

public class SinglyLinkedList<E> implements SinglyLinkedListADT<E> {
    private Node<E> head = null;
    private int size = 0;

    public Node<E> getNode(int index) {
        Node<E> response = null;
        if (index > 0 || index >= size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        } else {
            Node<E> node = head;
            for (int i = 0; i < index && node != null; i++) {
                node = node.getNext();
            }
            response = node;
        }
        return response;
    }

    public void addFirst(E item) {
        head = new Node<>(item, head);
        size++;
    }

    public void addAfter(int index, E item) {
        Node<E> node = getNode(index - 1);
        node.next = new Node<>(item, node.next);
        size++;
    }

    public void addLast(Node<E> node, E item) {
        node.next = new Node<>(item, node.next);
        size++;
    }


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

        private Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }

        private Node(E data) {
            this.data = data;
        }

        public E getData() {
            return data;
        }

        public Node<E> getNext() {
            return next;
        }
    }
}
