package linkedlist;

public class Q11IntersectionOfTwoSortedLL {
	static class Node {
		int val;
		Node next;

		Node(int val) {
			this.val = val;
		}
	}

	public static void printLL(Node head) {

		while (head != null) {
			System.out.print(head.val);
			head = head.next;
			if (head != null) {
				System.out.print("->");
			}
		}
		System.out.println();
	}

	public static Node interSection(Node list1, Node list2) {
		Node dummy = new Node(0);
		Node curr = dummy;

		while (list1 != null && list2 != null) {
			if (list1.val == list2.val) {
				curr.next = new Node(list1.val);
				curr = curr.next;
				list1 = list1.next;
				list2 = list2.next;
			} else if (list1.val < list2.val)
				list1 = list1.next;
			else
				list2 = list2.next;
		}

		return dummy.next;

	}

	public static void main(String[] args) {
		Node list1 = new Node(2);
		list1.next = new Node(3);
		list1.next.next = new Node(5);
		list1.next.next.next = new Node(7);
		list1.next.next.next.next = new Node(9);

		Node list2 = new Node(2);
		list2.next = new Node(5);
		list2.next.next = new Node(9);

		Node result = interSection(list1, list2);
		printLL(result);
		
	}
}
