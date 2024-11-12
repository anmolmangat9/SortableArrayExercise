// SortableArray.java

public class SortableArray {

    // Method to sort an array of integers using Quick Sort
    public int[] quickSortIntegers(int[] numbers) {
        quickSort(numbers, 0, numbers.length - 1);
        return numbers;
    }

    // Helper method for the recursive Quick Sort algorithm
    private void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    // Partition method used in Quick Sort
    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }

    // Method to sort an array of strings in alphabetical order using Bubble Sort
    public String[] bubbleSortStrings(String[] words) {
        int n = words.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (words[j].compareTo(words[j + 1]) > 0) {
                    // Swap words[j] and words[j+1]
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }
        return words;
    }

    public static void main(String[] args) {
        SortableArray sorter = new SortableArray();

        // Test the integer sorting method
        int[] intArray = {5, 3, 8, 4, 2};
        System.out.println("Original Integer Array: ");
        for (int num : intArray) {
            System.out.print(num + " ");
        }
        System.out.println("\nSorted Integer Array: ");
        intArray = sorter.quickSortIntegers(intArray);
        for (int num : intArray) {
            System.out.print(num + " ");
        }

        // Test the string sorting method
        String[] stringArray = {"banana", "apple", "grape", "cherry", "date"};
        System.out.println("\n\nOriginal String Array: ");
        for (String word : stringArray) {
            System.out.print(word + " ");
        }
        System.out.println("\nSorted String Array: ");
        stringArray = sorter.bubbleSortStrings(stringArray);
        for (String word : stringArray) {
            System.out.print(word + " ");
        }
    }
}
