package linkedlist;

public class Q9AddOneToLinkedList {
	static class Node{
		int val;
		Node next;
		Node(int val){
			this.val = val;
		}
	}
	static Node addOne(Node head) {
		
		head = reverse(head);
		Node current = head;
		int carry = 1;
		while(current!=null && carry!=0) {
			int sum = current.val+carry;
			current.val = sum%10;
			carry = sum/10;
			if(current.next == null && carry!=0) {
				current.next = new Node(carry);
				carry = 0;
			}
			current = current.next;
		}
		
		
		return reverse(head);
	}
	static Node reverse(Node head) {
		Node previous = null;
        Node current = head;
        

        while (current != null) {
            Node frontnext = current.next;
            current.next = previous;
            previous = current;
            current = frontnext;
        }

        return previous;
	}
	public static void main(String[] args) {
        Node head = new Node(9);
        head.next = new Node(9);
        head.next.next = new Node(9);
        head.next.next.next = new Node(9);

        Node newHead = addOne(head);
        

        while (newHead 	!= null) {
            System.out.print(newHead.val + " ");
            newHead = newHead.next;
        }
    }
}
