package org.phoenix.interview.ctci.linkedLists;

/**
 * Implement an algorithm to delete a node in the middle (i.e., any node but
 * the first and last node, not necessarily the exact middle) of a singly linked list, given only access to
 * that node.
 * EXAMPLE
 * Input: the node c from the linked list a - >b- >c - >d - >e- >f
 * Result: nothing is returned, but the new linked list looks like a - >b- >d - >e- >f
 */

public class DeleteMiddleNode {
    public static Node deleteNode(Node head) {
        if (head == null) return null;
        // Maintaining 3 pointers to store the nodes
        Node fast = head;
        Node slow = head;
        Node prev = null;
        // Moving counter to next node and changing path
        while (fast.next != null && fast.next.next != null) {
            prev = slow;
            fast = fast.next.next;
            slow = slow.next;
        }
        if (prev != null) {
            prev.next = slow.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        print(deleteNode(head));
    }

    private static void print(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}
