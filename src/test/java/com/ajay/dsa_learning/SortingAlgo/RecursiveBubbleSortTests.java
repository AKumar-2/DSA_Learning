package com.ajay.dsa_learning.SortingAlgo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RecursiveBubbleSortTests extends SortingAlgorithmBaseTest{

    @Autowired
    private RecursiveBubbleSort recursiveBubbleSort;

    @Override
    protected int[] sort(int[] arr) {
        return recursiveBubbleSort.recursiveBubbleSort(arr);
    }
}
