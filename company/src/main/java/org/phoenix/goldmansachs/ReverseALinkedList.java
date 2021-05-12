package org.phoenix.goldmansachs;

/**
 * Given a linked list of N nodes. The task is to reverse this list.
 * Constraints:
 * 1 <= N <= 104
 */

public class ReverseALinkedList {
    private static Node reverseList(Node head) {
        // Nodes to keep track of current, previous and
        // next node
        Node curr = head;
        Node next;
        Node prev = null;
        // Loop until curr is not null
        while (curr != null) {
            // Setting next node to current node's next
            next = curr.next;
            // pointing current's node next pointer
            // to previous
            curr.next = prev;
            // Setting previous node as current
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        System.out.println(reverseList(head).value);
    }

    //linked list node class:
    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }
}
