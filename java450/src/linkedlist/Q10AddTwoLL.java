package linkedlist;
/*
 * list1 : 9->9->9
 * list2 :    9->9
 * result:1->0->9->8
 * */
public class Q10AddTwoLL {
    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    static Node addTwoLL(Node head1, Node head2) {
        head1 = reverse(head1);
        head2 = reverse(head2);
        Node dummy = new Node(0);
        Node current = dummy;
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
            sum =sum% 10;
            current.next = new Node(sum);
            current = current.next;
        }

        return dummy.next;
    }

    static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node front = curr.next;
            curr.next = prev;
            prev = curr;
            curr = front;
        }
        return prev;
    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head1 = new Node(9);
        head1.next = new Node(9);
        head1.next.next = new Node(9);
      
        	

        Node head2 = new Node(9);
        head2.next = new Node(9);
       

        Node result = addTwoLL(head1, head2);
        printList(result);
    }
}
