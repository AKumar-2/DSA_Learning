package com.ajay.dsa_learning.SortingAlgo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MergeSortTests extends SortingAlgorithmBaseTest{

    @Autowired
    private MergeSort mergeSort;

    @Override
    protected int[] sort(int[] arr) {
        return mergeSort.mergeSort(arr);
    }
}
