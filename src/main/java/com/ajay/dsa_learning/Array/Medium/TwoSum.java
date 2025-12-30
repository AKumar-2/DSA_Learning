package com.ajay.dsa_learning.Array.Medium;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class TwoSum {
    public boolean is2Sum(int[] arr, int sum) {
        if (arr == null || arr.length == 1) {
            throw new IllegalArgumentException("Provide correct array");
        }

        Arrays.sort(arr);

        int right = arr.length - 1, left = 0;
        while (left < right) {
            int currSum = arr[left] + arr[right];
            if (currSum == sum) {
                return true;
            } else if (currSum < sum) {
                left++;
            } else {
                right--;
            }
        }

        return false;
    }
}
