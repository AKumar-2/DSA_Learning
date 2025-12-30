package com.ajay.dsa_learning.Array.Easy;

import org.springframework.stereotype.Component;

@Component
public class LargestElementInArray {

    public int findLargest(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be Empty");
        }else if (arr.length == 1) {
            return arr[0];
        }
        int largerst = Integer.MIN_VALUE;
        for (int num: arr){
            if (num > largerst) {
                largerst = num;
            }
        }
        return largerst;
    }
}
