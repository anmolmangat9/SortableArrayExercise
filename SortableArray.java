// File: SortableArray.java

import java.util.Arrays;

public class SortableArray {
    public int[] sortIntegers(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Input array cannot be null");
        }
        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);
        return sortedArray;
    }
}
