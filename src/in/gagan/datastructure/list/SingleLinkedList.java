package in.gagan.datastructure.list;

import java.util.Iterator;
import java.util.LinkedList;

public class SingleLinkedList<E> implements Iterable<E> {

    Node<E> head;
    Node<E> tail;
    int size = 0;

    public SingleLinkedList() { }

    public SingleLinkedList(int size) {
        this.size = size;
    }

    private static class Node<E> {
        E data;
        Node<E> next;
        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }

    }
    /*public int size() {

    }

    public boolean isEmpty() {

    }

    public void add(E element) {

    }

    public void addFirst(E element) {

    }

    public void addLast(E element) {

    }

    public E peekFirst() {

    }

    public E peekLast() {

    }

    public E remove(E element) {

    }

    public E remove(int index) {

    }

    public E removeFirst() {

    }

    public E removeLast() {

    }

    public int indexOf(E element) {

    }*/

    @Override
    public Iterator<E> iterator() {
        return null;
    }
}
