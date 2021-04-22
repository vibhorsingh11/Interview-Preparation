package org.phoenix.interview.ctci.treesandgraphs;

/**
 * Given a sorted (increasing order) array with unique integer elements, write an algorithm
 * to create a binary search tree with minimal height
 */

public class MinimalTree {
    public static TreeNode bstMinimal(int[] arr, int start, int end) {
        // Edge case
        if (end < start) return null;
        // Find the mid node
        int middle = start + (end - start) / 2;
        // Create a new node with middle element
        TreeNode node = new TreeNode(arr[middle]);
        // Then connect the mid from left side of array to
        // left node of tree... same step for right node
        node.left = bstMinimal(arr, start, middle - 1);
        node.right = bstMinimal(arr, middle + 1, end);
        return node;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        TreeNode root = bstMinimal(arr, 0, arr.length - 1);
        TreeNode.inorder(root);
    }
}
