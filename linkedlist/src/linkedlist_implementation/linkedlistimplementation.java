package linkedlist_implementation;

public class linkedlistimplementation {
	Node head = null;
	Node tail = null;
	
	 static class Node{
		int val;
		Node next;
		
		Node(int val){
			this.val = val;
		}
	}
	
		
		
		void insertAtEnd (int val) {
			Node temp = new Node(val);
			if(head == null) {
				head = temp;
			}else {
				tail.next =temp;
			}
			tail = temp;
		}
		
		void insertAtHead ( int val) {
			Node temp = new Node (val);
			if(head==null) {
				head = tail = temp;
			}else {
				temp.next = head;
				head = temp;
			}
		}
		int size() {
			Node temp = head;
			int count =0;
			while(temp!= null) {
				count++;
				temp = temp.next;
			}
			return count;
		}
		void insertAtIndexPos(int index,int val) {
			 Node temp = new Node(val);
	            Node temphead = head;
	            if (index == size()) {
	                insertAtEnd(val);
	                return;
	            } else if (head == null) {
	                insertAtHead(val);
	                return;
	            }
	            for (int i = 1; i <= index - 1; i++) {
	                temphead = temphead.next;
	            }
	            temp.next = temphead.next;
	            temphead.next = temp;
	        }
//		 
		void display() {
			Node temp = head;
			while(temp!=null) {
				System.out.print(temp.val);
				temp = temp.next;
				if(temp!=null) {
					System.out.print("->");
				}
				
			}
			System.out.println();
		}
	

	public static void main(String[] args) {
		linkedlistimplementation ll = new linkedlistimplementation();
		ll.insertAtEnd(4);
		ll.insertAtEnd(9);
		ll.insertAtHead(8);
		ll.insertAtIndexPos(1, 77);
		ll.display();
		System.out.print(ll.size());
	}

}
