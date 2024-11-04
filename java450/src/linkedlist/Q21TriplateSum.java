package linkedlist;

public class Q21TriplateSum {
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

	void display() {
		Node temp = head;
		do {
			System.out.print(temp.val);
			temp = temp.next;
			if (temp != null)
				System.out.print("<->");
		} while (temp != null);
		System.out.println();
	}

	void findTriplate(int target) {

		
		boolean found = false;
		for (Node current = head; current != null; current = current.next) {
			Node first = current.next;
			Node  last = tail;
			while (first != null && last != null && first != last && first.prev != last) {
				int tripletsum = current.val + first.val + last.val;
				if (tripletsum == target) {
					found = true;
					System.out.println("(" + current.val + "," + first.val + "," + last.val + ")");
					first = first.next;
					last = last.prev;
				} else if (tripletsum < target) {
					first = first.next;
				} else
					last = last.prev;
			}
		}
		if (!found) {
			System.out.print("triplet Not found");
		}
	}

	public static void main(String[] args) {
		Q21TriplateSum list = new Q21TriplateSum();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.display();
		list.findTriplate(17);
	}
}
