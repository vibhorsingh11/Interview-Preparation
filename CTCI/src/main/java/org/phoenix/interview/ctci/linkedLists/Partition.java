package org.phoenix.interview.ctci.linkedLists;

/**
 * Write code to partition a linked list around a value x, such that all nodes less than x come
 * before all nodes greater than or equal to x. lf x is contained within the list, the values of x only need
 * to be after the elements less than x (see below). The partition element x can appear anywhere in the
 * "right partition"; it does not need to appear between the left and right partitions.
 * EXAMPLE
 * Input: 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1 [partition = 5)
 * Output: 3 -> 1 -> 2 -> 10 -> 5 -> 5 -> 8
 */

public class Partition {
    public static Node partitionList(Node head, int x) {
        if (head == null || head.next == null) {
            return head;
        }
        // Heads of both the partitions
        Node leftHead = null;
        Node rightHead = null;
        // Left partition and right partition
        Node leftTraversalNode = null;
        Node rightTraversalNode = null;
        // Reference to the head node
        Node traversalNode = head;
        // Loop through the linked list
        while (traversalNode != null) {
            // If the current node has data less than x
            if (traversalNode.data < x) {
                // This should run only one time for head
                if (leftHead == null) {
                    leftTraversalNode = traversalNode;
                    leftHead = leftTraversalNode;
                } else {
                    leftTraversalNode.next = traversalNode;
                    leftTraversalNode = traversalNode;
                }
            } else {
                if (rightHead == null) {
                    rightTraversalNode = traversalNode;
                    rightHead = rightTraversalNode;
                } else {
                    rightTraversalNode.next = traversalNode;
                    rightTraversalNode = traversalNode;
                }
            }
            traversalNode = traversalNode.next;
        }
        // Dereference nodes to avoid cycle
        if (leftTraversalNode != null) {
            leftTraversalNode.next = null;
        }
        if (rightTraversalNode != null) {
            rightTraversalNode.next = null;
        }
        if (leftHead == null) {
            return rightHead;
        }
        // Link two lists
        leftTraversalNode.next = rightHead;
        return leftHead;
    }

    public static void main(String[] args) {
        Node head = new Node(3);
        head.next = new Node(5);
        head.next.next = new Node(8);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(10);
        head.next.next.next.next.next = new Node(2);
        head.next.next.next.next.next.next = new Node(1);
        print(partitionList(head, 5));
    }

    private static void print(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}
