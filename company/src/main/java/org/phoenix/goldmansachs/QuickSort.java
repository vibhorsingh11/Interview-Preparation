package org.phoenix.goldmansachs;

/**
 * Quick Sort is a Divide and Conquer algorithm. It picks an element as pivot and partitions the given array around the picked pivot.
 * Given an array arr[], its starting position low and its ending position high.
 * <p>
 * Implement the partition() and quickSort() functions to sort the array.
 * Constraints:
 * 1 <= N <= 103
 * 1 <= arr[i] <= 104
 */

public class QuickSort {
    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Getting partition
            int mid = partition(arr, low, high);
            quickSort(arr, low, mid - 1);
            quickSort(arr, mid + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    // Swapping values
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 1, 6, 10, 4, 1, 3, 9, 7};
        quickSort(arr, 0, arr.length - 1);

        for (int ele : arr) {
            System.out.print(ele + " ,");
        }
    }
}
