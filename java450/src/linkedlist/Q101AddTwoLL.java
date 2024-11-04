package linkedlist;
/*
 * list1 : 9->9->9
 * list2 :    9->9
 * result:8->9->0->1
 * */
public class Q101AddTwoLL {
	static class Node {
		int val;
		Node next;

		Node(int val) {
			this.val = val;
		}
	}

	public static Node addTwoLL(Node head1, Node head2) {
		Node dummy = new Node(0);
		Node curr = dummy;
		int carry = 0;
		while (head1 != null || head2 != null || carry != 0) {
			int sum = carry;
			if (head1 != null) {
				sum += head1.val;
				head1 = head1.next;
			}
			if (head2 != null) {
				sum += head2.val;
				head2 = head2.next;
			}
			carry = sum / 10;
			sum = sum % 10;
			curr.next = new Node(sum);
			curr = curr.next;
		}
		return dummy.next;
	}

	public static void printLL(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val);
			temp = temp.next;
			if(temp!=null) {
				System.out.print("->");
			}
		}
	}

	public static void main(String[] args) {
		Node head1 = new Node(9);
		head1.next = new Node(9);
		head1.next.next = new Node(9);

		Node head2 = new Node(9);
		head2.next = new Node(9);

		Node result = addTwoLL(head1, head2);
		printLL(result);
	}
}
