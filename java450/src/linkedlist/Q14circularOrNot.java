package linkedlist;



public class Q14circularOrNot {
	static class Node {
		int val;
		Node next;

		Node(int val) {
			this.val = val;
		}
	}
	public static boolean findCircular(Node head) {
		if(head ==null)return true;
		Node temp = head.next;
		
		while(temp!=null && temp!=head) {
			temp = temp.next;
		}
		return (temp == head);
	}

	public static void main(String[] args) {
		Node head = new Node(7);
		head.next = new Node(5);
		head.next.next = new Node(4);
		head.next.next.next = new Node(6);
		head.next.next.next.next = head;

		if (findCircular(head) == true) {
			System.out.print("Circular");
		} else
			System.out.print("Not Circular");
	}
}
