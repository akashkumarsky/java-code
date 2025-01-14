package linkedlist;



//Note 
public class Q3loopDetected {
	
	public static class Node {
		int val;
		Node next;

		Node(int val) {
			this.val = val;

		}
	}
	
	static boolean detectCycle(Node head) {
		Node slow = head;
		Node fast =head;
		
		while(fast != null || fast.next !=null) {
			slow=slow.next;
			fast = fast.next.next;
			
			if(slow == fast ) return true;
		}
		return false;
		
	}
	
	public static void main(String [] args) {
		Node head = new Node(1);
		Node b = new Node (2);
		Node c = new Node (3);
		Node d = new Node (5);
		Node f = new Node (6);
		Node e = new Node (7);
		
		head.next =b;
		b.next = c;
		c.next = d;
		d.next = f;
		f.next = d;
		
		if(detectCycle(head)){
			System.out.print("loop detected");
		}else {
			System.out.print("loop not detected");
		}
		
	}
}
