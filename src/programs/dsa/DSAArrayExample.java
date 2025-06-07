package programs.dsa;

import programs.utility.Utility;

/**
 * 1. Basic Operations
 * - Insert an element into an array.
 * - Delete an element from an array.
 * - Find the minimum and maximum elements in the array.
 * 2. Searching and Sorting
 * - Perform a binary search for a given element.
 * - Implement sorting algorithms (e.g., Bubble Sort, Merge Sort, Quick Sort).
 * - Find the Kth smallest/largest element.
 * 3. Prefix Sum and Sliding Window
 * - Find the sum of elements between given indices.
 * - Maximum sum of a subArray (Kadane’s Algorithm).
 * - Longest subArray with a sum equal to a given value.
 * 4. Two-Pointer Problems
 * - Find pairs in the array that sum up to a given number.
 * - Move all zeroes to the end while maintaining the relative order.
 * - Sort an array of 0s, 1s, and 2s (Dutch National Flag problem).
 * 5. Array Manipulation
 * - Reverse the array in place.
 * - Rotate the array by ‘k’ positions.
 * - Merge two sorted arrays without extra space.
 * 6. Searching for Patterns
 * - Find duplicates in an array (with and without extra space).
 * - Check if an array is a subset of another array.
 * - Find the longest consecutive sequence.
 * 7. Advanced Problems
 * - Trapping Rainwater problem.
 * - Find the majority element (appears more than n/2 times).
 * - Maximum product of two or three numbers.
 */

public class DSAArrayExample {
    private final BasicArrayExample bae;

    public DSAArrayExample(BasicArrayExample bae) {
        this.bae = bae;
    }

    // - Insert an element into an array.
    public void insertElementIntoAnArray(Object element) {
        try {
            Object[] baseArray = {2, 4, 6, 8, 10};
            Object[] insertArray = new Object[baseArray.length + 1];
            for (int i = 0; i < baseArray.length; i++) {
                insertArray[i] = baseArray[i];
            }
            insertArray[insertArray.length - 1] = element;
            if (bae != null) {
                bae.printArrayElements(insertArray);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // - Delete an element from an array.
    public void deleteElementFromAnArray(Object element) {
        Object[] baseArray = {2, 4, 6, 8, 10};
        Object[] deleteArray = new Object[baseArray.length - 1];
        int deleteIndex = 0;
        for (int i = 0; i < baseArray.length; i++) {
            // Skip the element to be deleted.
            if (!baseArray[i].equals(element)) {
                deleteArray[deleteIndex] = baseArray[i];
                deleteIndex++;
            }
        }
        if (bae != null) {
            bae.printArrayElements(deleteArray);
        }
    }

    public void findMaximumElementOfAnArray(int[] inputArray) {
        // Initialize maximumValue with the smallest possible value
        int maximumValue = Integer.MIN_VALUE;
        for (int i = 0; i < inputArray.length; i++) {
            // Update maximumValue if the current element is greater
            if (inputArray[i] > maximumValue) {
                maximumValue = inputArray[i];
            }
        }
        Utility.printToLogcat(DSAArrayExample.class, Thread.currentThread().getStackTrace().length >= 2 ? Thread.currentThread().getStackTrace()[2] : null, "maximumValue : " + maximumValue);
    }

    public void findMinimumElementOfAnArray(int[] inputArray) {
        // Initialize maximumValue with the largest possible value
        int minimumValue = Integer.MAX_VALUE;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] < minimumValue) {
                minimumValue = inputArray[i];
            }
        }
        Utility.printToLogcat(DSAArrayExample.class, Thread.currentThread().getStackTrace().length >= 2 ? Thread.currentThread().getStackTrace()[2] : null, "minimumValue : " + minimumValue);
    }
}
