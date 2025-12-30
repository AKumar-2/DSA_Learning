package com.ajay.dsa_learning.Array.Easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@DisplayName("Largest Element in Array")
public class LargestElementInArrayTests {

    @Test
    @DisplayName("Should return largest element when array has positive numbers")
    void shouldReturnLargestElement_WhenArrayHasPositiveNumbers() {
        // Arrange
        LargestElementInArray solution = new LargestElementInArray();
        int[] arr = {12, 35, 1, 10, 34, 1};

        // Act
        int result = solution.findLargest(arr);

        // Assert
        assertEquals(35, result);
    }

    @Test
    @DisplayName("Should return largest element when array has negative numbers")
    void shouldReturnLargestElement_WhenArrayHasNegativeNumbers() {
        // Arrange
        LargestElementInArray solution = new LargestElementInArray();
        int[] arr = {-5, -2, -10, -1, -8};

        // Act
        int result = solution.findLargest(arr);

        // Assert
        assertEquals(-1, result);
    }

    @Test
    @DisplayName("Should return element when array has single element")
    void shouldReturnElement_WhenArrayHasSingleElement() {
        // Arrange
        LargestElementInArray solution = new LargestElementInArray();
        int[] arr = {42};

        // Act
        int result = solution.findLargest(arr);

        // Assert
        assertEquals(42, result);
    }

    @Test
    @DisplayName("Should return largest when array has duplicate largest values")
    void shouldReturnLargest_WhenArrayHasDuplicateLargestValues() {
        // Arrange
        LargestElementInArray solution = new LargestElementInArray();
        int[] arr = {100, 50, 100, 25, 100};

        // Act
        int result = solution.findLargest(arr);

        // Assert
        assertEquals(100, result);
    }

    @Test
    @DisplayName("Should return largest when array has mixed positive and negative numbers")
    void shouldReturnLargest_WhenArrayHasMixedNumbers() {
        // Arrange
        LargestElementInArray solution = new LargestElementInArray();
        int[] arr = {-10, 5, -3, 20, 0, -1};

        // Act
        int result = solution.findLargest(arr);

        // Assert
        assertEquals(20, result);
    }

    @Test
    @DisplayName("Should throw exception when array is null")
    void shouldThrowException_WhenArrayIsNull() {
        // Arrange
        LargestElementInArray solution = new LargestElementInArray();

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            solution.findLargest(null);
        });
    }

    @Test
    @DisplayName("Should throw exception when array is empty")
    void shouldThrowException_WhenArrayIsEmpty() {
        // Arrange
        LargestElementInArray solution = new LargestElementInArray();
        int[] arr = {};

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            solution.findLargest(arr);
        });
    }
}