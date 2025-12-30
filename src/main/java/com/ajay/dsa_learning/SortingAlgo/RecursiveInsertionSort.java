package com.ajay.dsa_learning.SortingAlgo;

import org.springframework.stereotype.Component;

@Component
public class RecursiveInsertionSort {

    public int[] recursiveInsertion(int[] arr) {
        recursiveInsertionSort(arr, 1);
        return arr;
    }

    private void recursiveInsertionSort(int[] arr, int n) {
        if (n >= arr.length) return;

        insertionSort(arr, n);
        recursiveInsertionSort(arr, n + 1);
    }

    private void insertionSort(int[] arr, int n) {
        int i = n - 1;
        int curr = arr[n];

        while (i >= 0 && arr[i] > curr) {
            arr[i + 1] = arr[i];
            i--;
        }
        arr[i + 1] = curr;

    }
}
