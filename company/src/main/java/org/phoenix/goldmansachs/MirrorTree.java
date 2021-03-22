package org.phoenix.goldmansachs;

public class MirrorTree {
    TreeNode mirrorTree(TreeNode node) {
        // edge case
        if (node == null) return null;
        // Traversing tree nodes and assigning them
        TreeNode leftSubtree = mirrorTree(node.left);
        TreeNode rightSubtree = mirrorTree(node.right);
        node.left = rightSubtree;
        node.right = leftSubtree;
        return node;
    }
}

//A Binary Tree node
class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int item) {
        data = item;
        left = right = null;
    }
}
