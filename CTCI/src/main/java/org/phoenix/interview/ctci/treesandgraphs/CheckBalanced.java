package org.phoenix.interview.ctci.treesandgraphs;

/**
 * Implement a function to check if a binary tree is balanced. For the purposes of
 * this question, a balanced tree is defined to be a tree such that the heights of the two subtrees of any
 * node never differ by more than one.
 */

public class CheckBalanced {
    // O(n)
    public static boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        // Check for difference from left subtree and right subtree
        return Math.abs(getHeight(root.left) - getHeight(root.right)) <= 1;
    }

    public static int getHeight(TreeNode head) {
        if (head == null) return 0;
        int left = getHeight(head.left);
        int right = getHeight(head.right);
        if (left > right) {
            return left + 1;
        }
        return right + 1;
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(5);
        node.left.right = new TreeNode(6);
        System.out.println(isBalanced(node));
    }
}
