package com.ajay.dsa_learning.SortingAlgo;

import org.springframework.stereotype.Component;

@Component
public class SelectionSort {

    public int[] selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++){
            int minVal = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minVal]){
                    minVal = j;
                }
            }

            if (i != minVal){
                int temp = arr[i];
                arr[i] = arr[minVal];
                arr[minVal] = temp;
            }
        }

        return arr;
    }
}
