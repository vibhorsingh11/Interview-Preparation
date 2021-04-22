package org.phoenix.interview.ctci.treesandgraphs;

public class ValidateBST {

    public static boolean isBST(TreeNode root) {
        return isBST(root, null, null);
    }

    private static boolean isBST(TreeNode root, Integer min, Integer max) {
        if (root == null) return true;
        else if (min != null && root.data <= min || max != null && root.data >= max) {
            return false;
        } else {
            return isBST(root.left, min, root.data) && isBST(root.right, root.data, max);
        }
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(5);
        node.left.right = new TreeNode(6);
        System.out.println(isBST(node));

        node = new TreeNode(5);
        node.left = new TreeNode(2);
        node.right = new TreeNode(6);
        node.left.left = new TreeNode(1);
        node.left.right = new TreeNode(3);
        System.out.println(isBST(node));
    }
}
