package org.phoenix.goldmansachs;

/**
 * Given a linked list of size N. The task is to reverse every k nodes (where k is an input to the function) in the linked list.
 * Constraints:
 * 1 <= N <= 104
 * 1 <= k <= N
 */

public class ReverseALinkedListInGroupsOfGivenSize {
    public static Node reverse(Node head, int k) {
        Node curr = head;
        int count = 0;
        // Traverse till k + 1
        while (curr != null && count != k) {
            curr = curr.next;
            count++;
        }
        if (count == k) {
            // reverse list with k+1 node as head
            curr = reverse(curr, k);
            // reverse current given size groups
            while (count-- > 0) {
                Node tmp = head.next;
                head.next = curr;
                curr = head;
                head = tmp;
            }
            head = curr;
        }
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println(reverse(head, 3).data);
    }
}
