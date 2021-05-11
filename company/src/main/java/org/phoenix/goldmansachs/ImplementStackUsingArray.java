package org.phoenix.goldmansachs;

/**
 * Write a program to implement a Stack using Array. Your task is to use the class as shown in the comments in the code    * editor and complete the functions push() and pop() to implement a stack.
 */

public class ImplementStackUsingArray {
    int top;
    int[] arr = new int[1000];

    ImplementStackUsingArray() {
        top = -1;
    }

    //Function to push an integer into the stack.
    void push(int a) {
        if (top < 1000) {
            top++;
            arr[top] = a;
        }
    }

    //Function to remove an item from top of the stack.
    int pop() {
        if (top == -1) return -1;
        return arr[top--];
    }

    public static void main(String[] args) {
        ImplementStackUsingArray test = new ImplementStackUsingArray();
        test.push(2);
        test.push(3);
        System.out.println(test.pop());
        test.push(4);
        System.out.println(test.pop());
    }
}
