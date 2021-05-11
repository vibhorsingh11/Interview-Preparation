package org.phoenix.goldmansachs;

import java.util.Stack;

/**
 * Design a data-structure SpecialStack that supports all the stack operations like push(), pop(), isEmpty(), isFull()
 * and an additional operation getMin() which should return minimum element from the SpecialStack. Your task is to
 * complete all the functions, using stack data-Structure.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * Stack: 18 19 29 15 16
 * Output: 15
 * Explanation:
 * The minimum element of the stack is 15.
 */

public class SpecialStack {
    static int min;

    public void push(int a, Stack<Integer> s) {
        //add code here.

        if (s.size() == 0) {
            min = a;
            s.push(a);
        } else if (a >= min) s.push(a);
        else {
            s.push(2 * a - min);
            min = a;
        }

    }

    public int pop(Stack<Integer> s) {
        int res = s.peek();
        if (s.size() != 0 && s.peek() >= min) {
            res = s.peek();
            s.pop();
        } else if (s.size() != 0 && s.peek() < min) {

            min = 2 * min - s.peek();
            res = s.peek();

        }
        return res;
    }

    public int min(Stack<Integer> s) {
        //add code here.
        return min;
    }

    public boolean isFull(Stack<Integer> s, int n) {
        //add code here.
        return s.size() == n;
    }

    public boolean isEmpty(Stack<Integer> s) {
        //add code here.
        return s.size() == 0;
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        SpecialStack test = new SpecialStack();
        test.push(18, s);
        test.push(19, s);
        test.push(29, s);
        test.push(15, s);
        test.push(16, s);
        System.out.println(test.min(s));
    }
}
