package org.phoenix.goldmansachs;

import java.util.ListIterator;
import java.util.Stack;

/**
 * Given a stack, the task is to sort it such that the top of the stack has the greatest element.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * Stack: 3 2 1
 * Output: 3 2 1
 * Example 2:
 * <p>
 * Input:
 * Stack: 11 2 32 3 41
 * Output: 41 32 11 3 2
 * Expected Time Complexity : O(N*N)
 * Expected Auixilliary Space : O(N) recursive.
 * <p>
 * Constraints:
 * 1<=N<=100
 */

public class SortAStack {
    private static Stack<Integer> sort(Stack<Integer> s) {
        // If stack is not empty
        if (!s.isEmpty()) {
            // remove the top element
            int temp = s.pop();
            // apply sorting on rest of the elements
            sort(s);
            // push sorted element in stack back
            sortInsert(s, temp);
        }
        return s;
    }

    private static void sortInsert(Stack<Integer> s, int temp) {
        // Base case
        if (s.isEmpty() || temp > s.peek()) {
            s.push(temp);
            return;
        }
        // Remove top element
        int x = s.pop();
        // Recursively call insert
        sortInsert(s, temp);
        s.push(x);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(2);
        s.push(1);
        sort(s);
        printStack(s);
    }

    static void printStack(Stack<Integer> s) {
        ListIterator<Integer> lt = s.listIterator();
        while (lt.hasNext())
            lt.next();
        while (lt.hasPrevious())
            System.out.print(lt.previous() + " ");
    }
}
