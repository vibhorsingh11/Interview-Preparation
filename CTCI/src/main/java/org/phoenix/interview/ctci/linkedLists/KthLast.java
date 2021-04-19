package org.phoenix.interview.ctci.linkedLists;

/**
 * Implement an algorithm to find the kth to last element of a singly linked list
 */
public class KthLast {
    public static int KthToLast(Node head, int k) {
        if (head == null) return -1;
        Node fast = head;
        Node slow = head;
        // Moving the counter less than k times
        for (int i = 0; i < k && fast != null; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow.data;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        System.out.println(KthToLast(head, 3));

        System.out.println(KthToLast(head, 2));
        System.out.println(KthToLast(head, 1));
    }
}
