package linkedlist;

public class Q6RemoveDublicateSortedLL {
	static class Node {
		int val;
		Node next;
		Node(int val){
			this.val= val;
		}
	}
	
	static Node removeDublicate(Node head){
		//1->2->2->3->3->4
		//	 		p    n
		//1->2->3->4
		Node prev = head;
		Node newnext = prev.next;
		while(newnext != null) {
			if(prev.val==newnext.val) {
				newnext =newnext.next;
				continue;
			}
			prev.next = newnext;
			prev = newnext;
			newnext = newnext.next;
		}
		prev.next = null;
		return head;
	}
	static void printLinkedlist(Node head) {
		Node temp = head;
		while(temp !=null) {
			System.out.print(temp.val+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	public static void main(String [] args) {
		Node head = new Node(1);
		head.next = new Node(1);
		head.next.next = new Node(2);
		head.next.next.next = new Node (2);
		head.next.next.next.next = new Node (3);
		head.next.next.next.next.next = new Node(4);
		removeDublicate(head);
		printLinkedlist(head);
	}
}
