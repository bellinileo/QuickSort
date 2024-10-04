package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuickSortTest {

@Test
    void testPositiveNumbers() {
        int[] array = {4, 2, 7, 1, 9, 3};
        QuickSort.quickSort(array, 0, array.length - 1);
        assertArrayEquals(new int[]{1, 2, 3, 4, 7, 9}, array);
    }

    @Test
    void testNegativeNumbers() {
        int[] array = {-3, -1, -7, -4, -2};
        QuickSort.quickSort(array, 0, array.length - 1);
        assertArrayEquals(new int[]{-7, -4, -3, -2, -1}, array);

@Test
    void testPosMixNeg() {
        int[] array = {4, -2, -7, 1, 9, -3};
        QuickSort.quickSort(array, 0, array.length - 1);
        assertArrayEquals(new int[]{-7, -3, 1, 4, 7, 9}, array);
    }

    @Test
    void testPreSorted() {
        int[] array = {1, 2, 3, 4, 5};
        QuickSort.quickSort(array, 0, array.length - 1);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);
}

