package linkedlist;

public class Q4RemoveLoopOfLL {
	static class Node {
		int val;
		Node next;

		Node(int val) {
			this.val = val;
		}
	}

	static void removeLoopLL(Node head) {
		Node slow = head;
		Node fast = head;
		if (fast == null || fast.next == null)
			return;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				slow = head;
				if (slow != fast) {
					while (slow.next != fast.next) {
						slow = slow.next;
						fast = fast.next;
					}
					fast.next = null;
					// This case is added if fast and slow pointer meet at first position.
				} else {
					while (fast.next != slow) {
						fast = fast.next;
					}
					fast.next = null;
				}
			}
		}

	}

	static void printLinkedlist(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + "->");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Node head = new Node(1);
		Node b = new Node(2);
		Node c = new Node(3);
		Node d = new Node(4);
		Node e = new Node(5);
		Node f = new Node(6);

		head.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;
		f.next = c;

		removeLoopLL(head);
		printLinkedlist(head);

	}
}
