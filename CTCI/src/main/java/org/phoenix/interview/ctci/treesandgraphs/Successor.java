package org.phoenix.interview.ctci.treesandgraphs;

/**
 * Write an algorithm to find the "next" node (i .e., in-order successor) of a given node in a
 * binary search tree. You may assume that each node has a link to its parent.
 */

public class Successor {
    public static TreeNode1 findSuccessor(TreeNode1 root) {
        if (root == null) return null;
        if (root.right != null) {
            TreeNode1 curr = root.right;
            while (curr.left != null) {
                curr = curr.left;
            }
            return curr;
        } else {
            TreeNode1 prev = root.parent;
            while (prev != null && root == prev.right) {
                root = prev;
                prev = prev.parent;
            }
            return prev;
        }
    }

    public static void main(String[] args) {
        TreeNode1 root = new TreeNode1(1);
        root.left = new TreeNode1(2);
        root.left.parent = root;
        root.right = new TreeNode1(3);
        root.right.parent = root;
        root.left.left = new TreeNode1(4);
        root.left.left.parent = root.left;
        root.left.right = new TreeNode1(5);
        root.left.right.parent = root.left;
        root.right.right = new TreeNode1(6);
        root.right.right.parent = root.right;

        TreeNode1 successor = findSuccessor(root.right);
        System.out.println(successor == null ? "NULL" : successor.data);
    }
}

class TreeNode1 {

    int data;
    TreeNode1 left, right, parent;

    TreeNode1(int d) {
        data = d;
        left = right = parent = null;
    }
}
