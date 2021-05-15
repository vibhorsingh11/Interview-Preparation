package org.phoenix.goldmansachs;

import java.util.Stack;

/**
 * Implement a Queue using 2 stacks s1 and s2 .
 * A Query Q is of 2 Types
 * (i) 1 x (a query of this type means  pushing 'x' into the queue)
 * (ii) 2   (a query of this type means to pop element from queue and print the poped element)
 * Constraints:
 * 1 <= Q <= 100
 * 1 <= x <= 100
 */

public class QueueUsingTwoStacks {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    //Function to push an element in queue by using 2 stacks.
    private void Push(int x) {
        // Your code here
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
        s1.push(x);
        // 2->3
        //3->2
    }


    //Function to pop an element from queue by using 2 stacks.
    private int Pop() {
        // Your code here
        if (s1.isEmpty() && s2.isEmpty()) return -1;
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        return s2.pop();
    }

    public static void main(String[] args) {
        QueueUsingTwoStacks queue = new QueueUsingTwoStacks();
        queue.Push(2);
        queue.Push(3);
        System.out.println(queue.Pop());
        queue.Push(4);
        System.out.println(queue.Pop());
    }
}
