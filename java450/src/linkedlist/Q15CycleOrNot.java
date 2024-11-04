package linkedlist;

import linkedlist.Q14circularOrNot.Node;

public class Q15CycleOrNot {
	static class Node {
		int val;
		Node next;

		Node(int val) {
			this.val = val;
		}
	}

	public static boolean findCircular(Node head) {

		if (head == null || head.next == null)
			return false;
		Node slow = head;
		Node fast = head;

		while (fast != null) {

			//if (slow == null)return false;
			slow = slow.next;

			//if (fast.next == null)return false;
			fast = fast.next.next;
			if (slow == fast)
				return true;

		}
		return false;

	}

	public static void main(String[] args) {
		Node head = new Node(7);
		head.next = new Node(5);
		head.next.next = new Node(4);
		head.next.next.next = new Node(6);
		head.next.next.next.next = head.next;

		if (findCircular(head) == true) {
			System.out.print("cycle found");
		} else
			System.out.print("Cycle Not Found");

	}
}
