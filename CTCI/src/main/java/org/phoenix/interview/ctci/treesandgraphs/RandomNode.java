package org.phoenix.interview.ctci.treesandgraphs;

import java.util.Random;

/**
 * You are implementing a binary tree class from scratch which, in addition to
 * insert, find, and delete, has a method getRandomNode() which returns a random node
 * from the tree. All nodes should be equally likely to be chosen. Design and implement an algorithm
 * for getRandomNode, and explain how you would implement the rest of the methods.
 */

public class RandomNode {

    static class TreeNode {
        final int data;
        TreeNode left;
        TreeNode right;
        int size;

        TreeNode(int data) {
            this.data = data;
            this.size = 1;
        }

        public TreeNode getRandomNode() {
            int leftSize = left == null ? 0 : left.size();
            int randomIndex = new Random().nextInt(this.size);
            if (randomIndex < leftSize) {
                return left.getRandomNode();
            } else if (randomIndex == leftSize) {
                return this;
            } else {
                return right.getRandomNode();
            }
        }

        public void insert(int value) {
            if (value <= data) {
                if (left == null) {
                    left = new TreeNode(value);
                } else {
                    left.insert(value);
                }
            }
            else {
                if (right == null) {
                    right = new TreeNode(value);
                } else {
                    right.insert(value);
                }
            }
            size++;
        }

        public TreeNode search(int value) {
            if (value == data) {
                return this;
            } else if (value < data) {
                return left != null ? left.search(value) : null;
            } else {
                return right != null ? right.search(value) : null;
            }
        }

        public int size() {
            return this.size;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(20);
        root.insert(10);
        root.insert(30);
        root.insert(15);
        root.insert(17);
        root.insert(5);
        root.insert(7);
        root.insert(3);
        root.insert(35);
        System.out.println(root.getRandomNode().data);
        System.out.println(root.getRandomNode().data);
        System.out.println(root.search(17).data);
        System.out.println(root.search(28));
    }
}
