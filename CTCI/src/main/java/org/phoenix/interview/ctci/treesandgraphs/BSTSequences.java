package org.phoenix.interview.ctci.treesandgraphs;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * A binary search tree was created by traversing through an array from left to right
 * and inserting each element. Given a binary search tree with distinct elements, print all possible
 * arrays that could have led to this tree.
 * EXAMPLE
 * Input:
 * Output: {2, 1, 3}, {2, 3, 1}
 */

public class BSTSequences {
    private static ArrayList<LinkedList<Integer>> findBSTSequences(TreeNode root) {
        ArrayList<LinkedList<Integer>> results = new ArrayList<>();
        if (root == null) {
            results.add(new LinkedList<>());
            return results;
        }
        LinkedList<Integer> prefix = new LinkedList<>();
        prefix.add(root.data);
        ArrayList<LinkedList<Integer>> leftSequence = findBSTSequences(root.left);
        ArrayList<LinkedList<Integer>> rightSequence = findBSTSequences(root.right);

        for (LinkedList<Integer> left : leftSequence) {
            for (LinkedList<Integer> right : rightSequence) {
                ArrayList<LinkedList<Integer>> weaved = new ArrayList<>();
                weaveLists(left, right, prefix, weaved);
                results.addAll(weaved);
            }
        }
        return results;
    }

    private static void weaveLists(LinkedList<Integer> left, LinkedList<Integer> right, LinkedList<Integer> prefix, ArrayList<LinkedList<Integer>> weaved) {
        if (left.isEmpty() || right.isEmpty()) {
            LinkedList<Integer> currentPrefix = new LinkedList<>(prefix);
            currentPrefix.addAll(left);
            currentPrefix.addAll(right);
            weaved.add(currentPrefix);
            return;
        }
        Integer headLeft = left.removeFirst();
        prefix.addLast(headLeft);
        weaveLists(left, right, prefix, weaved);
        prefix.removeLast();
        left.addFirst(headLeft);

        Integer headRight = right.removeFirst();
        prefix.addLast(headRight);
        weaveLists(left, right, prefix, weaved);
        prefix.removeLast();
        right.addFirst(headRight);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        System.out.println(findBSTSequences(root));

        root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(30);
        System.out.println(findBSTSequences(root));
    }
}
