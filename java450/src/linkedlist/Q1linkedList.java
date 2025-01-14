package linkedlist;



public class Q1linkedList {

	public static class Node {
		int val;
		Node next;

		Node(int val) {
			this.val = val;

		}
	}

	public static void printlist(Node a) {
		Node temp = a;
		while (temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static Node printlistrecursivly(Node head) {
		Node temp = head;
		if (temp == null || temp.next == null) {
			return temp;
		}
		Node newhead = printlistrecursivly(temp.next);
		Node front = temp.next;
		front.next = temp;
		temp.next = null;

		return newhead;

	}

	public static void printItrative(Node head) {
		Node temp = head;
		Node prev = null;
		while (temp != null) {
			Node front = temp.next;
			temp.next = prev;
			prev = temp;
			temp = front;
		}
		printlist(prev);

	}

	public static void main(String[] args) {

		Node head = new Node(1);
		head.next = new Node(3);
		head.next.next = new Node(2);
		head.next.next.next = new Node(4);
		
		System.out.println();
		printlist(head);
		System.out.println();
//		Node ans = printlistrecursivly(head);
//		printlist(ans);
		System.out.println();
		printItrative(head);
		
	}

}
