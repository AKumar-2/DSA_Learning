package com.ajay.dsa_learning.SortingAlgo;

import org.springframework.stereotype.Component;

@Component
public class RecursiveBubbleSort {

    public int[] recursiveBubbleSort(int[] arr) {
        bubbleSort(arr, arr.length);
        return arr;
    }

    private void bubbleSort(int[] arr, int num) {
        if (num <= 0) {
            return;
        }
        boolean swapHappen = false;

        for (int i = 0; i < num - 1; i++){
            if (arr[i] > arr[i + 1]){
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                swapHappen = true;
            }
        }

        if (!swapHappen) return;

        bubbleSort(arr, num - 1);
    }
}
