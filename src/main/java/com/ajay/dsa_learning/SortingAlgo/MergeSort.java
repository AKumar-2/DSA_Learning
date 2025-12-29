package com.ajay.dsa_learning.SortingAlgo;

import org.springframework.stereotype.Component;

@Component
public class MergeSort {

    public int[] mergeSort(int[] arr) {
        mergeSortHelper(arr, 0, arr.length - 1);
        return arr;
    }

    private void mergeSortHelper(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        int mid = left + (right - left)/2;

        mergeSortHelper(arr, left, mid);
        mergeSortHelper(arr, mid + 1, right);

        merge(arr, left, mid, right);
    }

    private void merge(int[] arr, int left, int mid, int right) {
        int l1 = mid - left + 1;
        int l2 = right - mid;

        //temp array
        int[] leftTemp = new int[l1];
        int[] rightTemp = new int[l2];

        //Copy to temp array
        for (int i = 0; i < l1; i++) {
            leftTemp[i] = arr[left + i];
        }
        for (int i = 0; i < l2; i++) {
            rightTemp[i] = arr[mid + 1 + i];
        }

        //Sort
        int i = 0, j = 0, k = left;
        while (i < l1 && j < l2) {
            if (leftTemp[i] <= rightTemp[j]) {
                arr[k] = leftTemp[i];
                i++;
            } else {
                arr[k] = rightTemp[j];
                j++;
            }
            k ++;
        }

        while (i < l1) {
            arr[k] = leftTemp[i];
            i++;
            k++;
        }

        while (j < l2) {
            arr[k] = rightTemp[j];
            j++;
            k++;
        }
    }
}
