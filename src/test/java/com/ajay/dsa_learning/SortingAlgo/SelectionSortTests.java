package com.ajay.dsa_learning.SortingAlgo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SelectionSortTests extends SortingAlgorithmBaseTest{

    @Autowired
    private SelectionSort selectionSort;

    @Override
    protected int[] sort(int[] arr) {
        return selectionSort.selectionSort(arr);
    }
}
