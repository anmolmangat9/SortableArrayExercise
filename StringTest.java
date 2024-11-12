@Test
void testSortStrings() {
    SortableArray sortableArray = new SortableArray();
    #String[] input = {"banana", "apple", "cherry"};
    String[] expected = {"apple", "banana", "cherry"};
    assertArrayEquals(expected, sortableArray.sortStrings(input));
}
