package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
}

