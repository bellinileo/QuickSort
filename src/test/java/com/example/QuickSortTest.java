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
    
    @Test
    public void testQuickSortWideRange() {
        int[] array = {-1234, 567, -890, 345, -1500, 999, -2000, 1342, 789, -456, 1000, -999, 543, -1820, 2000, -320, 1111, -654, 1357, -182, 789, -760, 1760, 111, -1212, 1500, -111, 220, 900, -450};
        int[] expectedArray = {-2000, -1820, -1500, -1234, -1212, -999, -890, -760, -654, -456, -450, -320, -182, 111, 220, 345, 567, 789, 900, 999, 1111, 1342, 1500, 1760, 2000};
        QuickSort.quickSort(array, 0, array.length - 1);
        assertArrayEquals(expectedArray, array);
     }
    
    @Test
        public void testQuickNonInt() {
        String[] array = {"one", "two", "three", "four"};
        assertThrows(ClassCastException.class, () -> {
        QuickSort.quickSort(array, 0, array.length - 1); 
        });
    }
}

