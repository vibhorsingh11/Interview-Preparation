package org.phoenix.interview.ctci.stacksandqueues;

/**
 * Implement a MyQueue class which implements a queue using two stacks
 */

import java.util.Stack;

public class QueueViaStack {

    static class MyQueue<T> {
        private final Stack<T> oldest;
        private final Stack<T> newest;

        MyQueue() {
            this.oldest = new Stack<>();
            this.newest = new Stack<>();
        }

        public void add(T value) {
            newest.push(value);
        }

        public T poll() {
            remove();
            return oldest.pop();
        }

        public T peek() {
            remove();
            return oldest.peek();
        }

        public void remove() {
            if (oldest.isEmpty()) {
                while (!newest.isEmpty()) {
                    oldest.push(newest.pop());
                }
            }
        }
    }

    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println("Queue poll:" + queue.poll());
        System.out.println("Queue peek:" + queue.peek());
        System.out.println("Queue poll:" + queue.poll());
        System.out.println("Queue peek:" + queue.peek());
    }
}
