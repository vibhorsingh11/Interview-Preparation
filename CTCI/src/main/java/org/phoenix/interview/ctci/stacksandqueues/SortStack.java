package org.phoenix.interview.ctci.stacksandqueues;

/**
 * Write a program to sort a stack such that the smallest items are on the top. You can use
 * an additional temporary stack, but you may not copy the elements into any other data structure
 * (such as an array). The stack supports the following operations: push, pop, peek, and isEmpty.
 */

import java.util.Stack;

public class SortStack {

    public static void sort(Stack<Integer> dataStack) {
        Stack<Integer> tempStack = new Stack<>();
        while (!dataStack.isEmpty()) {
            int top = dataStack.pop();
            while (!tempStack.isEmpty() && top < tempStack.peek()) {
                dataStack.push(tempStack.pop());
            }
            tempStack.push(top);
        }
        while (!tempStack.isEmpty()) {
            dataStack.push(tempStack.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> dataStack = new Stack<>();
        for (int i = 0; i < 10; i++) {
            dataStack.push(i);
        }
        System.out.println("Stack before sorting:" + dataStack);
        sort(dataStack);
        System.out.println("Stack after sorting:" + dataStack);
    }
}
