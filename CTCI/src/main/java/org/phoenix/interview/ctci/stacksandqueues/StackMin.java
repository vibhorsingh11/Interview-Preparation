package org.phoenix.interview.ctci.stacksandqueues;

/**
 * How would you design a stack which, in addition to push and pop, has a function min
 * which returns the minimum element? Push, pop and min should all operate in 0(1) time.
 */

import java.util.EmptyStackException;
import java.util.Stack;

public class StackMin {

    private final Stack<Node> stack;

    public StackMin() {
        this.stack = new Stack<>();
    }

    public void push(int value) {
        // Setting minimum value and current value
        if (stack.isEmpty()) {
            stack.push(new Node(value, value));
        } else {
            stack.push(new Node(value, Math.min(value, stack.peek().min)));
        }
    }

    public int pop() {
        return stack.pop().data;
    }

    public int peek() {
        return stack.peek().data;
    }

    public int min() {
        return stack.peek().min;
    }

    public static void main(String[] args) {
        StackMin stackMin = new StackMin();
        stackMin.push(4);
        System.out.println("Pushed: " + stackMin.peek());
        stackMin.push(5);
        System.out.println("Pushed: " + stackMin.peek());
        stackMin.push(-3);
        System.out.println("Pushed: " + stackMin.peek());
        System.out.println("Min value: " + stackMin.min());
        stackMin.push(-2);
        System.out.println("Popped: " + stackMin.pop());
        System.out.println("Min value: " + stackMin.min());
        System.out.println("Popped: " + stackMin.pop());
        System.out.println("Popped: " + stackMin.pop());
        System.out.println("Min value: " + stackMin.min());
        System.out.println("Popped: " + stackMin.pop());
        try {
            System.out.println("Min value: " + stackMin.min());
        } catch (EmptyStackException e) {
            e.printStackTrace();
        }
        stackMin.push(1);
        System.out.println("Pushed: " + stackMin.peek());
        System.out.println("Min value: " + stackMin.min());
    }

    // Class for stack elements type
    static class Node {
        int data;
        int min;

        Node(int data, int min) {
            this.data = data;
            this.min = min;
        }
    }
}
