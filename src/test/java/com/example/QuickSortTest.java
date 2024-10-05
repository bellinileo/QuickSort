package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class QuickSortTest {

    @Test
    public void testQuickSort() {
        int[] array = {10, 7, 8, 9, 1, 5};
        int[] expectedArray = {1, 5, 7, 8, 9, 10};
        QuickSort.quickSort(array, 0, array.length - 1);
        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void testQuickSortEmptyArray() {
        int[] array = {};
        int[] expectedArray = {};
        QuickSort.quickSort(array, 0, array.length - 1);
        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void testQuickSortSingleElement() {
        int[] array = {5};
        int[] expectedArray = {5};
        QuickSort.quickSort(array, 0, array.length - 1);
        assertArrayEquals(expectedArray, array);
    }
    
    @Test
    public void testQuickRepeats() {
        int[] array = {10, 10, 10, 10, -5, -5};
        int[] expectedArray = {-5, -5, 10, 10, 10, 10};
        QuickSort.quickSort(array, 0, array.length - 1);
        assertArrayEquals(expectedArray, array);
    }
    
 
    @Test
    public void testQuickSortInvalidIndi() {
        int[] array = {5, 3, 8};
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            QuickSort.quickSort(array, -1, array.length - 1); // Invalid low index
        });
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            QuickSort.quickSort(array, 0, array.length); // Invalid high index
        });
    }
    
    @Test
    public void testQuickSortSorted() {
        int[] array = {1, 2, 3, 4, 5};
        int[] expectedArray = {1, 2, 3, 4, 5};
        QuickSort.quickSort(array, 0, array.length - 1);
        assertArrayEquals(expectedArray, array);
    }
    
    @Test
    public void testQuickSortReverseSorted() {
        int[] array = {5, 4, 3, 2, 1};
        int[] expectedArray = {1, 2, 3, 4, 5};
        QuickSort.quickSort(array, 0, array.length - 1);
        assertArrayEquals(expectedArray, array);
    }
}


