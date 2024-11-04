package linkedlist;

public class Q23ReverseDLLinGroup {
	Node head = null;
	Node tail = null;

	static class Node {
		int val;
		Node next;
		Node prev;
		Node(int val){
			this.val = val;
		}
	}
	void add(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head = newNode;
			tail = newNode;
		}else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
	}
	void display(Node head1) {
		Node temp = head1;
		do {
			System.out.print(temp.val);
			temp = temp.next;
			if(temp!=null) {
				System.out.print("<->");
			}
		}while(temp!=null);
		System.out.println();
	}
	Node reverseDLL(Node head1,int N) {
		head.next = null;
		Node temp ;
		Node curr = head;
		Node newhead = null;
		int count =0;
		
		while(count<N && curr!=null) {
			newhead = curr;
			temp = curr.prev;
			curr.prev = curr.next;
			curr.next = temp;
			curr = curr.prev;
			count++;
		}
		if(count>=N) {
			Node rest = reverseDLL(curr, N);
			head.next = rest;
			if(rest!=null) {
				rest.prev = head;
			}
		}
		return newhead;
	}
	public static void main(String [] args) {
		Q23ReverseDLLinGroup list = new Q23ReverseDLLinGroup();
		;
		for(int i =1; i<=10; i++) {
			 list.add(i);
			
		}
		Node head1 = list.head;
		list.display(head1);
		head1 = list.reverseDLL(head1, 3);
		list.display(head1);
	}
}
