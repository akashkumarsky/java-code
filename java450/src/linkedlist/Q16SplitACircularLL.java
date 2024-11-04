package linkedlist;

public class Q16SplitACircularLL {

	static class Node {
		int val;
		Node next;

		Node(int val) {
			this.val = val;
		}
	}

	public static void splitCircularList(Node head) {
		if (head == null || head.next == head) {

			return;
		}

		// Initialize slow and fast pointers
		Node slow = head;
		Node fast = head;

		// Use the slow and fast pointers to find the middle of the circular linked list
		while (fast.next != head && fast.next.next != head) {
			slow = slow.next;
			fast = fast.next.next;
		}

		// For lists with an even number of nodes, fast will end up at the node before
		// head
		// For lists with an odd number of nodes, fast will end up at the last node
		if (fast.next.next == head) {
			fast = fast.next;
		}

		// Set the heads of the two halves
		Node head1 = head;
		Node head2 = slow.next;

		// Split the list into two halves
		slow.next = head1; // End the first half
		fast.next = head2; // End the second half

		System.out.print("First half: ");
		printCircularList(head1);

		System.out.print("Second half: ");
		printCircularList(head2);
	}

	// Helper function to print a circular linked list
	public static void printCircularList(Node head) {
		if (head == null) {
			return;
		}
		Node temp = head;
		do {
			System.out.print(temp.val + " ");
			temp = temp.next;
		} while (temp != head);
		System.out.println();
	}

	public static void main(String[] args) {
		// Creating a circular linked list
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = head;

		splitCircularList(head);

	}

}
