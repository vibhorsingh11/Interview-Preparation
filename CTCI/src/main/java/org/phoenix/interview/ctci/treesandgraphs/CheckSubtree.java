package org.phoenix.interview.ctci.treesandgraphs;

/**
 * Tl and T2 are two very large binary trees, with Tl much bigger than T2. Create an
 * algorithm to determine if T2 is a subtree of Tl.
 * A tree T2 is a subtree ofTi if there exists a node n in Ti such that the subtree of n is identical to T2.
 * That is, if you cut off the tree at node n, the two trees would be identical.
 */

public class CheckSubtree {
    private static boolean isSubtree(TreeNode t1, TreeNode t2) {
        // Edge case
        if (t2 == null) {
            return true;
        }
        if (t1 == null) {
            return false;
        }
        // If bigger and smaller root node is same then we further check
        else if (t1.data == t2.data && matchTree(t1, t2)) {
            return true;
        }
        // Check left or right subtree
        return isSubtree(t1.left, t2) || isSubtree(t1.right, t2);
    }

    private static boolean matchTree(TreeNode t1, TreeNode t2) {
        // if both trees are empty
        if (t1 == null && t2 == null) {
            return true;
        }
        // If any tree is null
        if (t1 == null || t2 == null) {
            return false;
        }
        // If both trees root node does not match
        else if (t1.data != t2.data) {
            return false;
        }
        return matchTree(t1.left, t2.left) && matchTree(t1.right, t2.right);
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(3);
        t1.left = new TreeNode(4);
        t1.right = new TreeNode(5);
        t1.left.left = new TreeNode(1);
        t1.left.right = new TreeNode(2);
        TreeNode t2 = new TreeNode(4);
        t2.left = new TreeNode(1);
        t2.right = new TreeNode(2);
        System.out.println(isSubtree(t1, t2));

        t1.left.right.left = new TreeNode(0);
        System.out.println(isSubtree(t1, t2));
    }
}
