// src/SortableArrayTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SortableArrayTest {

    @Test
    public void testSortIntegers() {
        SortableArray sorter = new SortableArray();
        int[] numbers = {3, 1, 2};
        int[] expected = {1, 2, 3};
        assertArrayEquals(expected, sorter.sortIntegers(numbers));
    }
}
