package linkedlist;

public class Q13FindMiddleElement {
	static class Node{
		int val;
		Node next;
		Node(int val){
			this.val = val;
			
		}
	}
	public static Node findMid(Node list) {
		Node slow = list;
		Node fast = list;
		while(fast!=null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	
	
	public static void main(String [] args) {
		Node list  = new Node(1);
		list.next = new Node(3);
		list.next.next = new Node (9);
		list.next.next.next = new Node(5);
		list.next.next.next.next = new Node(7);
		
		Node result = findMid(list);
		System.out.print(result.val);
		
	}
}
