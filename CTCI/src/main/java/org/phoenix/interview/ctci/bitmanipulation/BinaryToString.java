package org.phoenix.interview.ctci.bitmanipulation;

/**
 * Given a real number between 8 and 1 (e.g., 0.72) that is passed in as a double,
 * print the binary representation. If the number cannot be represented accurately in binary with at
 * most 32 characters, print "ERROR:'
 */

public class BinaryToString {
    public static String printBinary(double num) {
        // Edge case
        if (num >= 1 || num <= 0) {
            return "ERROR";
        }
        // String to store result
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(".");
        // Loop until num greater than 0
        while (num > 0) {
            if (stringBuilder.length() >= 32) {
                return "ERROR";
            }
            // left shift by 1 position
            double r = num * 2;
            if (r >= 1) {
                stringBuilder.append(1);
                num = r - 1;
            } else {
                stringBuilder.append(0);
                num = r;
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(printBinary(0.72));
        System.out.println(printBinary(0.625));
        System.out.println(printBinary(0.78125));
    }
}
