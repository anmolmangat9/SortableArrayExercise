// File: test/SortableArrayTest.java

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SortableArrayTest {

    @Test
    public static void main(String[] args) {
        // Test Feature 1: Sort integers
        int[] integers = {5, 3, 8, 9, 2};
        System.out.println("Original Integers: " + Arrays.toString(integers));
        int[] sortedIntegers = sortIntegers(integers);
        System.out.println("Sorted Integers: " + Arrays.toString(sortedIntegers)}
