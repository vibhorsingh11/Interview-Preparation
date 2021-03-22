package org.phoenix.goldmansachs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MirrorTreeTest {

    private final MirrorTree test = new MirrorTree();

    @Test
    void mirrorTree() {
        TreeNode head = new TreeNode(1);
        head.left = new TreeNode(3);
        head.right = new TreeNode(2);
        head.right.left = new TreeNode(5);
        head.right.right = new TreeNode(4);

        assertEquals(2, test.mirrorTree(head).left.data);
    }
}