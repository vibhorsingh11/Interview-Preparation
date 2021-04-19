package org.phoenix.interview.ctci.linkedLists;

/**
 * You have two numbers represented by a linked list, where each node contains a single
 * digit. The digits are stored in reverse order, such that the 1 's digit is at the head of the list. Write a
 * function that adds the two numbers and returns the sum as a linked list.
 * EXAMPLE
 * Input: (7-) 1 -) 6) + (5 -) 9 -) 2) .Thatis,617 + 295.
 * Output: 2 -) 1 -) 9. That is, 912.
 * FOLLOW UP
 * Suppose the digits are stored in forward order. Repeat the above problem.
 * EXAMPLE
 * Input: (6 -) 1 -) 7) + (2 -) 9 -) 5).Thatis,617 + 295.
 * Output: 9 -) 1 -) 2. That is, 912.
 */
public class SumLists {
    private static Node sumBack(Node head1, Node head2) {
        // Setting heads to new nodes
        Node list1 = head1;
        Node list2 = head2;
        Node temp = new Node(0);
        Node node = temp;
        // Variable to store the carry
        int carry = 0;
        // looping until list1 & list2 are not empty
        while (list1 != null || list2 != null) {
            int x = (list1 != null) ? list1.data : 0;
            int y = (list2 != null) ? list2.data : 0;
            // calculating the value
            int val = carry + x + y;
            // getting the carry
            carry = Math.abs(val / 10);
            // adding value to new node
            node.next = new Node(val % 10);
            node = node.next;
            if (list1 != null) list1 = list1.next;
            if (list2 != null) list2 = list2.next;
        }
        // Checking carry is smaller than 0
        if (carry > 0) {
            node.next = new Node(carry);
        }
        return temp.next;
    }

    private static Node sumForward(Node head1, Node head2) {
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }
        head1 = reverse(head1);
        head2 = reverse(head2);
        return reverse(sumBack(head1, head2));
    }

    private static Node reverse(Node head) {
        //if (head != null) return null;
        Node prev = null;
        Node current = head;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        Node head1 = new Node(7);
        head1.next = new Node(1);
        head1.next.next = new Node(6);

        Node head2 = new Node(5);
        head2.next = new Node(9);
        head2.next.next = new Node(2);
        print(sumBack(head1, head2));

        System.out.println("\n");

        Node head3 = new Node(6);
        head3.next = new Node(1);
        head3.next.next = new Node(7);

        Node head4 = new Node(2);
        head4.next = new Node(9);
        head4.next.next = new Node(5);
        print(sumForward(head3, head4));
    }

    private static void print(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}
