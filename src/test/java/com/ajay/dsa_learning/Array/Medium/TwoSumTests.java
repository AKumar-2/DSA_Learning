package com.ajay.dsa_learning.Array.Medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("TwoSum Component Tests")
class TwoSumTest {

    private TwoSum twoSum;

    @BeforeEach
    void setUp() {
        twoSum = new TwoSum();
    }

    @Nested
    @DisplayName("Valid Input Tests")
    class ValidInputTests {

        @Test
        @DisplayName("Should return true when two elements sum to target")
        void shouldReturnTrueWhenSumExists() {
            int[] arr = {2, 7, 11, 15};
            assertTrue(twoSum.is2Sum(arr, 9));
        }

        @Test
        @DisplayName("Should return false when no two elements sum to target")
        void shouldReturnFalseWhenSumDoesNotExist() {
            int[] arr = {2, 7, 11, 15};
            assertFalse(twoSum.is2Sum(arr, 30));
        }

        @Test
        @DisplayName("Should handle array with negative numbers")
        void shouldHandleNegativeNumbers() {
            int[] arr = {-3, 4, 3, 90};
            assertTrue(twoSum.is2Sum(arr, 0));
        }

        @Test
        @DisplayName("Should handle array with duplicate values")
        void shouldHandleDuplicateValues() {
            int[] arr = {3, 3, 11, 15};
            assertTrue(twoSum.is2Sum(arr, 6));
        }

        @Test
        @DisplayName("Should handle array with zero")
        void shouldHandleZeroInArray() {
            int[] arr = {0, 4, 3, 90};
            assertTrue(twoSum.is2Sum(arr, 4));
        }

        @Test
        @DisplayName("Should work with unsorted array")
        void shouldWorkWithUnsortedArray() {
            int[] arr = {15, 2, 11, 7};
            assertTrue(twoSum.is2Sum(arr, 9));
        }

        @Test
        @DisplayName("Should handle large arrays")
        void shouldHandleLargeArrays() {
            int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            assertTrue(twoSum.is2Sum(arr, 19));
        }

        @Test
        @DisplayName("Should return false for two-element array with no match")
        void shouldHandleTwoElementArrayNoMatch() {
            int[] arr = {1, 2};
            assertFalse(twoSum.is2Sum(arr, 10));
        }

        @Test
        @DisplayName("Should return true for two-element array with match")
        void shouldHandleTwoElementArrayWithMatch() {
            int[] arr = {5, 5};
            assertTrue(twoSum.is2Sum(arr, 10));
        }

        @Test
        @DisplayName("Should handle mix of positive and negative numbers")
        void shouldHandleMixedSignNumbers() {
            int[] arr = {-10, -5, 0, 5, 10};
            assertTrue(twoSum.is2Sum(arr, 0));
        }
    }

    @Nested
    @DisplayName("Invalid Input Tests")
    class InvalidInputTests {

        @Test
        @DisplayName("Should throw IllegalArgumentException for null array")
        void shouldThrowExceptionForNullArray() {
            IllegalArgumentException exception = assertThrows(
                    IllegalArgumentException.class,
                    () -> twoSum.is2Sum(null, 10)
            );
            assertEquals("Provide correct array", exception.getMessage());
        }

        @Test
        @DisplayName("Should throw IllegalArgumentException for single-element array")
        void shouldThrowExceptionForSingleElementArray() {
            int[] arr = {5};
            IllegalArgumentException exception = assertThrows(
                    IllegalArgumentException.class,
                    () -> twoSum.is2Sum(arr, 10)
            );
            assertEquals("Provide correct array", exception.getMessage());
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCaseTests {

        @Test
        @DisplayName("Should handle very large sum")
        void shouldHandleVeryLargeSum() {
            int[] arr = {Integer.MAX_VALUE - 1, 1, 2, 3};
            assertTrue(twoSum.is2Sum(arr, Integer.MAX_VALUE));
        }

        @Test
        @DisplayName("Should handle very small sum")
        void shouldHandleVerySmallSum() {
            int[] arr = {Integer.MIN_VALUE + 1, -1, -2, -3};
            assertTrue(twoSum.is2Sum(arr, Integer.MIN_VALUE));
        }

        @Test
        @DisplayName("Should return false when sum requires same element twice")
        void shouldNotUseSameElementTwice() {
            int[] arr = {5, 10, 15};
            assertFalse(twoSum.is2Sum(arr, 10));
        }
    }
}