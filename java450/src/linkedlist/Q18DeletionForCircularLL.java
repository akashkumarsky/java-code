package linkedlist;
 //Node class use from Q17
public class Q18DeletionForCircularLL {
	static Node head = null;
	Node tail = null;

	public void add(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
			newNode.next = head;
		} else {
			tail.next = newNode;
			tail = newNode;
			tail.next = head;
		}
	}

	public void display(Node head1) {
		Node temp = head1;
		if (temp == null) {
			System.out.print("List is empty");
			return;
		}

		do {
			System.out.print(temp.data + " ");
			temp = temp.next;
		} while (temp != head);
		System.out.println();

	}

	void deleteNode(int key) {
		if (head == null) {
			System.out.println("List is empty.");
			return;
		}
		Node current = head;
		Node previous = null;

		// Check if the node to be deleted is the head node
		if (head.data == key) {
			if (head == tail) { // Only one node in the list
				head = null;
				tail = null;
			} else {
				tail.next = head.next;
				head = head.next;
			}
			return;
		}

		// Traverse the list to find the node to delete
		do {
			previous = current;
			current = current.next;
			if (current.data == key) {
				previous.next = current.next;
				if (current == tail) { // Update tail if the node to delete is the last node
					tail = previous;
				}
				return;
			}
		} while (current != head);

		System.out.println("Node with data " + key + " not found.");
	}

	public static void main(String[] args) {
		Q18DeletionForCircularLL list = new Q18DeletionForCircularLL();
		list.add(1);
		list.add(2);
		list.add(3);
		
		list.add(4);
		list.display(head);
		list.deleteNode(4);
		list.display(head);
	}

}
