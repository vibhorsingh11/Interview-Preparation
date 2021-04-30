package org.phoenix.interview.ctci.bitmanipulation;

public class Debugger {
    public static boolean debugger(int n) {
        // n & (n - 1) == 0 checks if n is a pow of two or not
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(debugger(64));
        System.out.println(debugger(1048576));
        System.out.println(debugger(24));
        System.out.println(debugger(23367780));
    }
}
