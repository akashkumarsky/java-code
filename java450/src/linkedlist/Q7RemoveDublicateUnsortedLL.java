package linkedlist;

import java.util.HashSet;

public class Q7RemoveDublicateUnsortedLL {
	static class Node {
		int val;
		Node next;

		Node(int val) {
			this.val = val;
		}
	}

	static Node removeOfUnsortedLL(Node head) {
		HashSet<Integer> hs = new HashSet<>();
		Node temp = head;
		Node newhead = null;
		while (temp != null) {
			if (hs.contains(temp.val)) {
				newhead.next = temp.next;
			} else {
				hs.add(temp.val);
				newhead = temp;

			}
			temp = temp.next;
		}

		return newhead;
	}

	static void printlist(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(10);
		head.next.next = new Node(11);
		head.next.next.next = new Node(11);
		head.next.next.next.next = new Node(12);
		head.next.next.next.next.next = new Node(11);
		head.next.next.next.next.next.next = new Node(10);
		removeOfUnsortedLL(head);
		printlist(head);
	}
}
