package com.ajay.dsa_learning.SortingAlgo;

import org.junit.jupiter.api.DisplayName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@DisplayName("BubbleSort tests")
public class BubbleSortTests extends SortingAlgorithmBaseTest{

    @Autowired
    private BubbleSort bubbleSort;

    @Override
    protected int[] sort(int[] arr) {
        return bubbleSort.bubbleSort(arr);
    }
}
