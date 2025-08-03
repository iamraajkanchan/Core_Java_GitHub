package programs.dsa.array_example;


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
        Object[] baseArray = {2, 4, 6, 8, 10};
        Object[] insertArray = new Object[baseArray.length + 1];
        for (int i = 0; i < insertArray.length; i++) {
            insertArray[i] = baseArray[i];
        }
        insertArray[insertArray.length - 1] = element;
        bae.printArrayElements(insertArray);
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
        bae.printArrayElements(deleteArray);
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

    // Array is searching from left element to right element of the array one by one.
    public int binarySearch(Integer[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            Utility.printToLogcat(DSAArrayExample.class, Thread.currentThread().getStackTrace().length >= 2 ? Thread.currentThread().getStackTrace()[2] : null, "low : " + low);
            Utility.printToLogcat(DSAArrayExample.class, Thread.currentThread().getStackTrace().length >= 2 ? Thread.currentThread().getStackTrace()[2] : null, "high : " + high);
            int mid = (low + high) / 2;
            Utility.printToLogcat(DSAArrayExample.class, Thread.currentThread().getStackTrace().length >= 2 ? Thread.currentThread().getStackTrace()[2] : null, "mid : " + mid);
            Utility.printToLogcat(DSAArrayExample.class, Thread.currentThread().getStackTrace().length >= 2 ? Thread.currentThread().getStackTrace()[2] : null, "arr[mid} : " + arr[mid]);
            Utility.printToLogcat(DSAArrayExample.class, Thread.currentThread().getStackTrace().length >= 2 ? Thread.currentThread().getStackTrace()[2] : null, "target : " + target);
            if (arr[mid] == target) {
                return mid; // Element found
            } else if (arr[mid] < target) {
                Utility.printToLogcat(DSAArrayExample.class, Thread.currentThread().getStackTrace().length >= 2 ? Thread.currentThread().getStackTrace()[2] : null, "low : " + low);
                low = mid + 1;
                Utility.printToLogcat(DSAArrayExample.class, Thread.currentThread().getStackTrace().length >= 2 ? Thread.currentThread().getStackTrace()[2] : null, "mid : " + mid);
            } else {
                Utility.printToLogcat(DSAArrayExample.class, Thread.currentThread().getStackTrace().length >= 2 ? Thread.currentThread().getStackTrace()[2] : null, "mid : " + mid);
                high = mid - 1;
                Utility.printToLogcat(DSAArrayExample.class, Thread.currentThread().getStackTrace().length >= 2 ? Thread.currentThread().getStackTrace()[2] : null, "high : " + high);
            }
        }
        return -1; // Element not found
    }

    public void bubbleSortForArray(Integer[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // Last i elements are already sorted, so no need to compare them
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    private void merge(Integer[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Temporary arrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }

        // Merge the temporary arrays back into the original array
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray (if any)
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArray (if any)
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // Method to sort the array using Merge Sort
    private void mergeSort(Integer[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            // Recursively sort the first and second halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    public void mergeSortForArray(Integer[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

}
