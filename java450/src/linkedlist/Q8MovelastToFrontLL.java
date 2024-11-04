package linkedlist;

public class Q8MovelastToFrontLL {
	static class Node{
		int val;
		Node next;
		Node(int val){
			this.val = val;
		}
	}
	static Node movelastToFront(Node head) {
		Node temp = head;
		Node seclast =null;
		if(head==null || head.next==null) return head;
		while(temp.next!=null) {
			seclast = temp;
			temp = temp.next;
		}
		seclast.next =null;
		temp.next=head;
		head = temp;
		
		
		
		return head;
	}
	static void printLinkedlist(Node head) {
		Node temp =head;
		while(temp!=null) {
			System.out.print(temp.val+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	public static void main(String [] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		Node head1 =movelastToFront(head);
		printLinkedlist(head1);
	}
}


