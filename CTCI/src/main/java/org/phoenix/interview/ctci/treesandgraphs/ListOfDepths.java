package org.phoenix.interview.ctci.treesandgraphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Given a binary tree, design an algorithm which creates a linked list of all the nodes
 * at each depth (e.g., if you have a tree with depth 0, you'll have 0 linked lists).
 */
public class ListOfDepths {

    public static List<List<Integer>> listOfDepths(TreeNode root) {
        // List to store the results
        List<List<Integer>> res = new ArrayList<>();
        // Storing nodes
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        // Looping until queue is not empty
        while (!queue.isEmpty()) {
            int size = queue.size();
            // Maintaining levels of tree
            List<Integer> level = new ArrayList<>();
            // loop until the queue size
            while (size-- > 0) {
                TreeNode node = queue.poll();
                if (node != null) {
                    level.add(node.data);
                    if (node.left != null) {
                        queue.add(node.left);
                    }
                    if (node.right != null) {
                        queue.add(node.right);
                    }
                }
            }
            res.add(level);
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(listOfDepths(root));
    }
}
