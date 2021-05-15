package org.phoenix.goldmansachs;

/**
 * Implement a Queue using an Array. Queries in the Queue are of the following type:
 * (i) 1 x   (a query of this type means  pushing 'x' into the queue)
 * (ii) 2     (a query of this type means to pop element from queue and print the poped element)
 * Constraints:
 * 1 ≤ Q ≤ 105
 * 1 ≤ x ≤ 105
 */

public class ImplementQueueUsingArray {
    int front, rear;
    int[] arr = new int[100005];

    ImplementQueueUsingArray() {
        front = 0;
        rear = 0;
    }

    //Function to push an element x in a queue.
    void push(int a) {
        //inserting x in the queue at rear.
        arr[rear++] = a;
    }

    //Function to pop an element from queue and return that element.
    int pop() {
        //if front is equal to rear, queue is empty.
        if (front == rear)
            return -1;
        //else we return the element at front.
        return arr[front++];
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
