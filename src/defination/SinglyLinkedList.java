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
                node = node.next;
            }
            response = node;
        }
        return response;
    }

    public void add(int index, E item) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException(Integer.toString(index));
        if (index == 0)
            addFirst(item);
        else
            addLast(getNode(index - 1), item);
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

    public E remove(int index) {
        E response = null;
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        } else if (index == 0) {
            response = removeFirst();
        } else {
            Node<E> previousNode = getNode(index - 1);
            response = removeLast(previousNode);
        }
        return response;
    }


    public E removeFirst() {
        Node<E> node = head;
        if (head != null) {
            head = head.next;
            size--;
            return node.data;
        } else {
            return null;
        }
    }

    public E removeAfter(int index) {
        Node<E> node = getNode(index - 1);
        if (node.next != null) {
            node.next = node.next.next;
            size--;
            return node.next.data;
        } else {
            return null;
        }
    }

    public E removeLast(Node<E> node) {
        Node<E> temp = node.next;
        if (temp != null) {
            node.next = temp.next;
            size--;
            return temp.data;
        } else {
            return null;
        }
    }


    @Override
    public void add(E item) {
        add(size, item);
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
