import java.sql.SQLOutput;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> Mlist = new LinkedList<>();

        Mlist.add("Wuling");
        Mlist.add("Honda");
        Mlist.add("Hyundai");
        Mlist.add("BMW");

        System.out.println("Linked List: " + Mlist);

        String pertama = Mlist.getFirst();
        String terakhir = Mlist.getLast();

        System.out.println("Elemen Pertama: " + pertama);
        System.out.println("ELemen Terakhir: " + terakhir);

        Mlist.remove("Honda");

        System.out.println("Linked List Setelah di edit" + Mlist);
    }
}
class DoublyLinkedList<E> {

    private Node<E> head;
    private Node<E> tail;
    private int size;

    private static class Node<E> {
        private E data;
        private Node<E> prev;
        private Node<E> next;

        public Node(E data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public DoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void add(E element) {
        Node<E> newNode = new Node<E>(element);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void remove(E element) {
        Node<E> current = head;
        while (current != null) {
            if (current.data.equals(element)) {
                if (current.prev == null && current.next == null) {
                    head = null;
                    tail = null;
                } else if (current.prev == null) {
                    head = current.next;
                    head.prev = null;
                } else if (current.next == null) {
                    tail = current.prev;
                    tail.next = null;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                size--;
                return;
            }
            current = current.next;
        }
    }

    public E getFirst() {
        if (head == null) {
            return null;
        }
        return head.data;
    }

    public E getLast() {
        if (tail == null) {
            return null;
        }
        return tail.data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<E> current = head;
        while (current != null) {
            sb.append(current.data).append(" ");
            current = current.next;
        }
        return sb.toString();
    }
}
