package linkedlist;

class Node {
    int data;
    Node next;
	

    Node(int data) {
        this.data = data;
        
    }
}
public class Q17palindromeOrNot {
	Node head;

    // Function to check if the linked list is a palindrome
    boolean isPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        // Find the middle of the linked list
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half of the list
        Node secondHalf = reverse(slow);
        Node secondHalfCopy = secondHalf; // To restore the list later

        // Compare the first half and the reversed second half
        Node firstHalf = head;
        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        // Restore the list (optional)
        reverse(secondHalfCopy);

        return true;
    }

    // Function to reverse a linked list
    Node reverse(Node node) {
    	 Node temp = node;
        Node prev = null;
       

        while (temp != null) {
             Node front = temp.next;
             temp.next = prev;
             prev = temp ;
             temp = front;
        }

        return prev;
    }

    // Function to insert a node at the end of the linked list
    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
	public static void main(String[] args) {
		Q17palindromeOrNot ll = new Q17palindromeOrNot();
		ll.insert(1);
		ll.insert(2);
		ll.insert(3);
		ll.insert(3);
		ll.insert(2);
		ll.insert(1);
		
		System.out.println("is the linked list a palindrome? " + ll.isPalindrome());
		

	}

}
