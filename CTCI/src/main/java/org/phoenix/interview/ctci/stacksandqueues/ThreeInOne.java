package org.phoenix.interview.ctci.stacksandqueues;

/**
 * Describe how you could use a single array to implement three stacks.
 */

import java.util.Arrays;
import java.util.EmptyStackException;

public class ThreeInOne {
    private final int[] arr;
    private final int capacity;
    private final int[] stacks;

    public ThreeInOne(int capacity) {
        this.capacity = capacity;
        this.stacks = new int[3];
        this.arr = new int[3 * capacity];
    }

    public void push(int index, int value) {
        if (isFull(index)) {
            throw new StackOverflowError();
        }
        stacks[index]++;
        arr[indexTop(index)] = value;
    }

    public int pop(int stackIndex) {
        if (isEmpty(stackIndex)) {
            throw new EmptyStackException();
        }
        // Get the top of the corresponding stack
        int topIndex = indexTop(stackIndex);
        int top = arr[topIndex];
        // Reset the top
        arr[topIndex] = 0;
        // Reduce the size of corresponding stack
        stacks[stackIndex]--;
        return top;
    }

    public int peek(int stackIndex) {
        if (isEmpty(stackIndex)) {
            throw new EmptyStackException();
        }
        return arr[indexTop(stackIndex)];
    }

    public int indexTop(int index) {
        int offset = index * capacity;
        // Get size of the current stack
        int size = stacks[index];
        return offset + size - 1;
    }

    public boolean isFull(int index) {
        return stacks[index] == capacity;
    }

    public boolean isEmpty(int index) {
        return stacks[index] == 0;
    }

    public static void main(String[] args) {
        ThreeInOne threeInOne = new ThreeInOne(5);
        for (int i = 0; i < 15; i++) {
            threeInOne.push(i % 3, i + 1);
        }
        System.out.println(Arrays.toString(threeInOne.arr));
        for (int i = 0; i < 15; i++) {
            System.out.print(threeInOne.peek(i % 3) + " ");
        }
        System.out.println();
        try {
            threeInOne.push(0, 15);
        } catch (StackOverflowError e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 15; i++) {
            System.out.print(threeInOne.pop(i % 3) + " ");
        }
        try {
            threeInOne.pop(1);
        } catch (EmptyStackException e) {
            e.printStackTrace();
        }
    }
}
