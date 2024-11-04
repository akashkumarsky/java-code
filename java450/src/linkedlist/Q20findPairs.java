package linkedlist;
// work on sorted list
public class Q20findPairs {
	Node head = null;
	Node tail = null;

	static class Node {
		int val;
		Node next;
		Node prev;

		Node(int val) {
			this.val = val;
		}
	}

	void add(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
	}
	void display() {
		Node temp = head;
		do {
			System.out.print(temp.val);
			temp= temp.next;
			if(temp!=null) {
				System.out.print("<->");
			}
		}while(temp!=null);
		System.out.println();
	}
	void findpair(int target) {
		Node first = head;
		Node second = tail;
		
		//while(second.next != null) second = second.next; //no need if tail are given
		
		boolean found = false;
		while(first != null && second != null && first!=second && first.prev != second ) {
			int pairSum = first.val + second.val;
			
			if(pairSum == target) {
				found = true;
				System.out.println("("+first.val+","+second.val+")");
				first = first.next;
				second = second.prev;
			}else if(pairSum > target) {
				second = second.prev;
			
			}else first = first.next;
		}
		if(!found) {
			System.out.print("pair Not found");
		}
	}

	public static void main(String[] args) {

		Q20findPairs list = new Q20findPairs();
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(4);
		list.add(6);
		list.add(7);
		list.display();
		list.findpair(8);

	}

}
