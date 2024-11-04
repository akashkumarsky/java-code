package linkedlist;

public class Q19ReverseDLL {
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
			System.out.print(temp.val + " ");
			temp = temp.next;
			if (temp != null)
				System.out.print("->");
		}
	}

	void revers() {
		
		Node curr = head;
		Node temp = null;
		while(curr!=null) {
			temp = curr.prev;
			curr.prev = curr.next;
			curr.next = temp;
			curr = curr.prev;
			
		}
		if(temp !=null) {
			head = temp.prev;
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		Q19ReverseDLL list = new Q19ReverseDLL();
		list.add(1);
		list.add(3);
		list.add(5);
		list.display();
		list.revers();
		list.display();

	}
}
