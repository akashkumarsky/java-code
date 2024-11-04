package javaArray;

/**
 * Q22RotateDLLByStep
 */
public class Q22RotateDLLByStep {
    Node head = null;
    Node tail = null;

    static class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
        }
    }

    void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public static void main(String[] args) {
        Q22RotateDLLByStep  list = new Q22RotateDLLByStep();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
    }
}