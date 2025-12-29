package com.ajay.dsa_learning.SortingAlgo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RecursiveInsertionSortTests extends SortingAlgorithmBaseTest{

    @Autowired
    private RecursiveInsertionSort recursiveInsertionSort;

    @Override
    protected int[] sort(int[] arr) {
        return recursiveInsertionSort.recursiveInsertion(arr);
    }
}
