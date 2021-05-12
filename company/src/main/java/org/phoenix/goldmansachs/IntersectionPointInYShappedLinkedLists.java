package org.phoenix.goldmansachs;

/**
 * Given two singly linked lists of size N and M, write a program to get the point where two linked lists intersect
 * each other.
 * Expected Time Complexity: O(N+M)
 * Expected Auxiliary Space: O(1)
 */

public class IntersectionPointInYShappedLinkedLists {
    private static int intersectPoint(Node head1, Node head2) {
        // Base case
        if (head1 == null || head2 == null) {
            return 0;
        }
        // New node to store reference
        Node list1 = head1;
        Node list2 = head2;
        // Looping until list1 is not equal to list2
        while (list1 != list2) {
            if (list1 == null) {
                list1 = head2;
            }
            if (list2 == null) {
                list2 = head1;
            }
            // both list is same
            if (list1 == list2) {
                return list1.data;
            }
            list1 = list1.next;
            list2 = list2.next;
        }
        return list1 == null ? 0 : list1.data;
    }

    public static void main(String[] args) {
        Node head1 = new Node(3);
        head1.next = new Node(6);
        head1.next.next = new Node(9);
        head1.next.next.next = new Node(15);
        head1.next.next.next.next = new Node(3);

        Node head2 = new Node(10);
        head2.next = head1.next.next.next;
        System.out.println(intersectPoint(head1, head2));
    }

    // Node of a linked list
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
}
