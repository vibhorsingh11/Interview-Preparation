package org.phoenix.interview.ctci.linkedLists;

/**
 * Given two (singly) linked lists, determine if the two lists intersect. Return the intersecting
 * node. Note that the intersection is defined based on reference, not value. That is, if the kth
 * node of the first linked list is the exact same node (by reference) as the jth node of the second
 * linked list, then they are intersecting.
 */

public class Intersection {
    public static Node intersectionList(Node headA, Node headB) {
        if (headA == null || headB == null) return null;
        Node listA = headA;
        Node listB = headB;
        // Looping until both lists are not equal
        while (listA != listB) {
            // If listA is empty then set it to
            // listB vice versa..
            if (listA == null) listA = headB;
            if (listB == null) listB = headA;
            if (listA == listB) {
                return listA;
            }
            listA = listA.next;
            listB = listB.next;

        }
        return listA;
    }

    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);

        Node head2 = new Node(6);
        head2.next = new Node(5);
        head2.next.next = new Node(4);
        head2.next.next.next = head1.next.next;
        head2.next.next.next.next = new Node(2);
        head2.next.next.next.next.next = new Node(1);

        System.out.println(intersectionList(head1, head2).data);

        Node head3 = new Node(2);
        head3.next = new Node(6);
        head3.next.next = new Node(4);

        Node head4 = new Node(1);
        head4.next = new Node(5);

        System.out.println(intersectionList(head3, head4));
    }
}
