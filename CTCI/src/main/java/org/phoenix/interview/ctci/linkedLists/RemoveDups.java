package org.phoenix.interview.ctci.linkedLists;

import java.util.HashSet;
import java.util.Set;

public class RemoveDups {
    public static Node duplicates(Node head) {
        if (head == null) return null;
        // Set to store the nodes value
        Set<Integer> set = new HashSet<>();
        Node prev = null;
        Node curr = head;
        // Looping until nodes are empty
        while (curr != null) {
            if (set.contains(curr.data)) {
                prev.next = curr.next;
            } else {
                set.add(curr.data);
                prev = curr;
            }
            curr = curr.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(1);
        head.next = new Node(2);
        System.out.println(duplicates(head).next.data);
    }
}

class Node {
    Node next = null;
    int data;

    public Node(int d) {
        data = d;
    }
}
