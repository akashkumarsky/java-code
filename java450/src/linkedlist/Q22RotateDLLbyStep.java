package linkedlist;

public class Q22RotateDLLbyStep {
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
		while (temp != null) {
			System.out.print(temp.val);
			temp = temp.next;
			if (temp != null) {
				System.out.print("<->");
			}
		}
		System.out.println();
	}

	void rotateDLL(int N) {
		if (head == null || N == 0)
			return;
		Node current = head;
		int count = 1;
		while (count < N && current != null) {
			current = current.next;
			count++;

		}
		Node Nthvalue = current;
		while (current.next != null) {
			current = current.next;
		}
		
		current.next = head;
		head.prev = current;
		head = Nthvalue.next;
		head.prev = null;
		Nthvalue.next = null;
		tail = Nthvalue;

	}

	public static void main(String[] args) {
		Q22RotateDLLbyStep list = new Q22RotateDLLbyStep();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.display();
		list.rotateDLL(4);
		list.display();
	}

}
