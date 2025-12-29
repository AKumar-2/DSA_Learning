package com.ajay.dsa_learning.SortingAlgo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Sorting Algorithm Base Tests")
public abstract class SortingAlgorithmBaseTest {

    // Abstract method to be implemented by each sorting test
    protected abstract int[] sort(int[] arr);

    @Test
    @DisplayName("Should sort unsorted array")
    void testUnsortedArray() {
        int[] input = {64, 34, 25, 12, 22, 11, 90};
        int[] expected = {11, 12, 22, 25, 34, 64, 90};
        assertArrayEquals(expected, sort(input));
    }

    @Test
    @DisplayName("Should handle already sorted array")
    void testAlreadySorted() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, sort(input));
    }

    @Test
    @DisplayName("Should handle reverse sorted array")
    void testReverseSorted() {
        int[] input = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, sort(input));
    }

    @Test
    @DisplayName("Should handle duplicates")
    void testDuplicates() {
        int[] input = {5, 2, 8, 2, 9, 1, 5};
        int[] expected = {1, 2, 2, 5, 5, 8, 9};
        assertArrayEquals(expected, sort(input));
    }

    @Test
    @DisplayName("Should handle empty array")
    void testEmptyArray() {
        assertArrayEquals(new int[]{}, sort(new int[]{}));
    }

    @Test
    @DisplayName("Should handle single element")
    void testSingleElement() {
        assertArrayEquals(new int[]{42}, sort(new int[]{42}));
    }

    @Test
    @DisplayName("Should handle negative numbers")
    void testNegativeNumbers() {
        int[] input = {-5, -1, -10, -3};
        int[] expected = {-10, -5, -3, -1};
        assertArrayEquals(expected, sort(input));
    }

    @Test
    @DisplayName("Should handle mixed positive and negative")
    void testMixedNumbers() {
        int[] input = {-3, 5, -1, 0, 8, -7, 2};
        int[] expected = {-7, -3, -1, 0, 2, 5, 8};
        assertArrayEquals(expected, sort(input));
    }
}