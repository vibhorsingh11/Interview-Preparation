package org.phoenix.goldmansachs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DeleteWithoutHeadPointerTest {

    private final DeleteWithoutHeadPointer test = new DeleteWithoutHeadPointer();

    @Test
    void deleteNode() {
        Node head = new Node(1);
        head.next = new Node(2);
        assertEquals(2, test.deleteNode(head).data);
    }
}