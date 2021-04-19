package org.phoenix.interview.ctci.linkedLists;

/**
 * Implement a function to check if a linked list is a palindrome.
 */

public class IsPalindrome {
    private static boolean palindromeList(Node head) {
        if (head == null) return true;
        Node fast = head;
        Node slow = head;
        // traversing node till middle
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        // Reversing node from middle
        Node mid = reverse(slow);
        Node curr = head;
        // Comparing node
        while (mid != null) {
            if (mid.data != curr.data) {
                return false;
            }
            mid = mid.next;
            curr = curr.next;
        }
        return true;
    }

    private static Node reverse(Node head) {
        if (head == null) return null;
        Node current = head;
        Node prev = null;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);

        System.out.println(palindromeList(head));
    }
}
