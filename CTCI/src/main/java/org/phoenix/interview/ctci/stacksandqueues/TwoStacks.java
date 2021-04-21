package org.phoenix.interview.ctci.stacksandqueues;

/**
 * Describe how you could use a single array to implement two stacks.
 */

import java.util.EmptyStackException;

public class TwoStacks {
    private final int[] arr;
    private final int size;

    private int top1;
    private int top2;

    TwoStacks(int capacity) {
        this.size = capacity;
        this.arr = new int[this.size];
        top1 = -1;
        top2 = size;
    }

    public void push(int index, int value) {
        if (top1 + 1 == top2) {
            throw new StackOverflowError();
        }
        if (index == 0) {
            top1++;
            arr[top1] = value;
        } else {
            top2--;
            arr[top2] = value;
        }
    }

    public int pop(int index) {
        if (index == 0) {
            if (top1 == -1) {
                throw new EmptyStackException();
            }
            return arr[top1--];
        } else {
            if (top2 == size) {
                throw new EmptyStackException();
            }
            return arr[top2++];
        }
    }

    public static void main(String[] args) {
        TwoStacks twoStacks = new TwoStacks(10);
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                twoStacks.push(0, i);
            } else {
                twoStacks.push(1, i);
            }
        }
        for (int i = 1; i <= 5; i++) {
            System.out.println("First stack: " + twoStacks.pop(0));
            System.out.println("Second stack: " + twoStacks.pop(1));
        }
    }
}
