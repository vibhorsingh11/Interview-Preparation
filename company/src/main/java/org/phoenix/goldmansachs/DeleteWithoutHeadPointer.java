/**
 * You are given a pointer/ reference to the node which is to be deleted from the linked list of N nodes. The task is
 * to delete the node. Pointer/ reference to head node is not given.
 * Note: No head reference is given to you. It is guaranteed that the node to be deleted is not a tail node in the linked list.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 2
 * value[] = {1,2}
 * node = 1
 * Output: 2
 * Explanation: After deleting 1 from the
 * linked list, we have remaining nodes
 * as 2.
 * Constraints:
 * 1 <= N <= 103
 */
package org.phoenix.goldmansachs;

public class DeleteWithoutHeadPointer {
    public Node deleteNode(Node node) {
        // Removing head from the list
        if (node != null && node.next != null) {
            node.data = node.next.data;
            node.next = node.next.next;
        }
        return node;
    }
}

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
