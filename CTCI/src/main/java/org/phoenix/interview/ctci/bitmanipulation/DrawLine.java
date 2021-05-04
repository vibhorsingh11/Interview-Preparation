package org.phoenix.interview.ctci.bitmanipulation;

/**
 * A monochrome screen is stored as a single array of bytes, allowing eight consecutive pixels to be stored
 * in one byte.
 * <p>
 * The screen has width w, where w is divisible by 8 (that is, no byte will be split across rows).
 * The height of the screen, of course, can be derived from the length of the array and the width.
 * <p>
 * Implement a function that draws a horizontal line from (x1, y) to (x2, y) .
 * The method signature should look something like:
 * drawLine(byte[] screen, int width, int x1, int x2, int y)
 */

public class DrawLine {
    private static void drawLine(byte[] screen, int width, int x1, int x2, int y) {
        int startOffset = x1 % 8;
        int firstFullByte = x1 / 8;
        if (startOffset != 0) {
            firstFullByte++;
        }
        int endOffset = x2 % 8;
        int lastFullByte = x2 / 8;
        if (endOffset != 7) {
            lastFullByte--;
        }
        for (int i = firstFullByte; i <= lastFullByte; i++) {
            screen[(width / 8) * y + i] = (byte) 0xFF;
        }
        int startMask = (byte) (0xFF >> startOffset);
        int endMask = (byte) ~(0xFF >> endOffset);
        if (x1 / 8 == x2 / 8) {
            byte mask = (byte) (startMask & endMask);
            screen[(width / 8) * y + (x1 / 8)] |= mask;
        } else {
            if (startOffset != 0) {
                int byteNumber = (width / 8) * y + firstFullByte - 1;
                screen[byteNumber] |= startMask;
            }
            if (endMask != 7) {
                int byteNumber = (width / 8) * y + lastFullByte + 1;
                screen[byteNumber] |= endMask;
            }
        }
    }

    public static void main(String[] args) {
        byte[] screen = new byte[16];
        int width = 32;
        System.out.println("Original Screen:");
        printScreen(screen, width);
        drawLine(screen, width, 0, 6, 0);
        System.out.println("Horizontal Line:");
        printScreen(screen, width);
        drawLine(screen, width, 31, 31, 1);
        drawLine(screen, width, 2, 29, 2);
        drawLine(screen, width, 1, 5, 3);
        System.out.println("Horizontal Line:");
        printScreen(screen, width);
    }

    private static void printScreen(byte[] screen, int width) {
        int num = 1, widthNum = width / 8;
        for (byte b : screen) {
            for (int i = 7; i >= 0; --i) {
                System.out.print((b >> i) & 1);
            }
            if (num % widthNum == 0) {
                System.out.println();
            }
            ++num;
        }
        System.out.println();
    }
}
