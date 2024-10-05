package com.example;

public class QuickSort {

    public static void quickSort(int[] array, int low, int high) {
        // - Uninitized varis
        int uninitializedVar; // This var not initialized
        if (low < high) {
            int partitionIndex = partition(array, low, high);
            quickSort(array, low, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        // Anomaly 2-- out of bounds
        if (high >= array.length) { 
            int outOfBoundsElement = array[high]; // Out Of Bounds?
        }
        
        int pivot = array[high]; // Out of Bounds?
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
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
}
