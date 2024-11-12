
// File: src/SortableArray.java

public class SortableArray {

    /**
     * Sorts an array of integers in ascending order.
     * @param arr the array of integers to sort
     * @return the sorted array
     */
    public int[] sortIntegers(int[] arr) {
        if (arr == null) throw new IllegalArgumentException("Array cannot be null");
        int[] sortedArray = arr.clone();
        java.util.Arrays.sort(sortedArray);
        return sortedArray;
    }
}
