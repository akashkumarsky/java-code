package linkedlist;

public class Q5findStartNodeOfLoop {
	static class Node {
		int val;
		Node next;

		Node(int val) {
			this.val = val;
		}
	}

	static Node findStartOfLoop(Node head) {
		Node slow = head;
		Node fast = head;
		if (fast == null || fast.next == null)
			return null;

		while (fast != null && fast.next != null) {
			if(slow == fast) break;
			slow = slow.next;
			fast = fast.next.next;
		}	
		if(slow!=fast) return null;
		
		slow = head;
		while(slow != fast) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow;
			
	}

	public static void main(String[] args) {
		Node head = new Node(1);
		Node b = new Node(2);
		Node c = new Node(3);
		Node d = new Node(4);
		head.next = b; 
		b.next = c;
		c.next = d;
		d.next = null;

		Node ans = findStartOfLoop(head);
		if(ans !=null) {
			System.out.print("loop startwith "+ans.val);
		}else {
			System.out.print("loop not found");
		}
		

	}
}
