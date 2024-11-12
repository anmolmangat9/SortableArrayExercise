import java.util.Arrays;

public class SortableArray {

    // Feature 1: Sort an array of integers using Bubble Sort
    public static int[] sortIntegers(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    // Feature 2: Sort an array of strings using Arrays.sort
    public static String[] sortStrings(String[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    public static void main(String[] args) {
        // Test Feature 1: Sort integers
        int[] integers = {5, 3, 8, 1, 2};
        System.out.println("Original Integers: " + Arrays.toString(integers));
        int[] sortedIntegers = sortIntegers(integers);
        System.out.println("Sorted Integers: " + Arrays.toString(sortedIntegers));

        // Test Feature 2: Sort strings
        String[] strings = {"Banana", "Apple", "Cherry", "Mango"};
        System.out.println("Original Strings: " + Arrays.toString(strings));
        String[] sortedStrings = sortStrings(strings);
        System.out.println("Sorted Strings: " + Arrays.toString(sortedStrings));
    }
}
