package linkedlist;

public class Q12FindInterSection {
	static class Node {
		int val;
		Node next;

		Node(int val) {
			this.val = val;
		}
	}

	public static Node findintersection(Node list1, Node list2) {
		if (list1 == null || list2 == null)
			return null;

		Node d1 = list1;
		Node d2 = list2;
		while (d1 != d2) {
			d1 = (d1 == null ? list2 : d1.next);
			d2 = (d2 == null ? list1 : d2.next);
		}
		return d1;
	}

	public static void main(String[] args) {
		Node list1 = new Node(2);
		list1.next = new Node(3);
		list1.next.next = new Node(5);
		list1.next.next.next = new Node(7);
		list1.next.next.next.next = new Node(9);

		Node list2 = new Node(1);
		list2.next = new Node(33);
		list2.next.next = list1.next.next;// createing Intersection

		Node result = findintersection(list1, list2);
		if (result == null) {
			System.out.print("Intersection Not found -> " + result);
		} else
			System.out.print("found at -> " + result.val);
	}
}
