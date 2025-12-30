package com.ajay.dsa_learning.SortingAlgo;

import org.springframework.stereotype.Component;

@Component
public class InsertionSort {

    public int[] insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int j = i - 1;
            int curr = nums[i];
            while (j >= 0 && curr < nums[j]) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = curr;
        }
        return nums;
    }
}
