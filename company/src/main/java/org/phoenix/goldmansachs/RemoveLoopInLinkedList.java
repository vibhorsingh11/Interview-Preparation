package org.phoenix.goldmansachs;

/**
 * You are given a linked list of N nodes. Remove the loop from the linked list, if present.
 * Note: X is the position of the node to which the last node is connected to. If it is 0, then there is no loop.
 * Expected time complexity : O(n)
 * Expected auxiliary space : O(1)
 * <p>
 * Constraints:
 * 1 <= N <= 104
 */

public class RemoveLoopInLinkedList {
    public static void removeLoop(Node head) {
        // Base case
        if (head == null) return;
        // pointers to keep track of nodes
        Node fast = head;
        Node slow = head;
        Node preFast = null;
        // boolean to track whether there is loop
        boolean loopFound = false;
        // Looping until fast is empty to reach the
        // loop node
        while (fast != null && fast.next != null) {
            slow = slow.next;
            preFast = fast.next;
            fast = fast.next.next;
            if (fast == slow) {
                loopFound = true;
                break;
            }
        }
        // If no loop then just return
        if (!loopFound) return;
        slow = head;
        // Traverse the list and set the previous node
        // of fast to null, to remove the loop
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
            preFast = preFast.next;
        }
        if (preFast != null) {
            preFast.next = null;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = head.next.next;

        removeLoop(head);

        head = null;
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        removeLoop(head);
    }

    // Definition of Node class
    static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
        }
    }
}
