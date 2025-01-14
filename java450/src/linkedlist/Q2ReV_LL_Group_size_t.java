package linkedlist;



public class Q2ReV_LL_Group_size_t {
	static class Node {
		int val;
		Node next;
		
		Node(int val) {
			this.val = val;
		}
	}
	static Node tReverse(Node head, int t) {
		Node temp = head;
		Node prevlast= null;
		while(temp != null) {
			Node t_node = get_t_Node(temp, t);
			if(t_node ==null) {
				if(prevlast!=null) {
					prevlast.next = temp;
				}
				break;
			}
			Node nextNode = t_node.next;
			t_node.next =null;
			reverseLinkedList(temp);
			
			if(temp == head) {
				head = t_node;
			}else {
				prevlast.next = t_node;
			}
			prevlast = temp;
			temp = nextNode;
		}
		return head;
	}

	static Node reverseLinkedList(Node head) {
		Node temp = head;
		Node prev = null;
		while(temp!=null) {
			Node front = temp.next;
			temp.next = prev;
			prev=temp;
			temp=front;
		}
		return prev;
	}

	static void printLinkedList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	static Node get_t_Node(Node temp, int t) {
		t -=1;
		while(temp!=null  && t>0) {
			t--;
			temp=temp.next;
		}
		return temp;
	}

	public static void main(String[] args) {
		Node head = new Node(5);
		head.next = new Node(4);
		head.next.next = new Node(3);
		head.next.next.next = new Node(7);
		head.next.next.next.next = new Node(9);
		head.next.next.next.next.next = new Node(2);

		// Print the original linked list
		System.out.print("Original Linked List: ");
		printLinkedList(head);

		// Reverse the linked list
		
 
		// Print the reversed linked list
		System.out.print("Reversed Linked List: ");
		printLinkedList(tReverse(head, 3));
	}

}
