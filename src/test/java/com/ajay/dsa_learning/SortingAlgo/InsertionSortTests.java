package com.ajay.dsa_learning.SortingAlgo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class InsertionSortTests extends SortingAlgorithmBaseTest {

    @Autowired
    private InsertionSort insertionSort;

    @Override
    protected int[] sort(int[] arr) {
        return insertionSort.insertionSort(arr);
    }
}
