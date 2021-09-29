package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class MatrixSumTest {
    @Test
    public void whenSingle() {
        int[][] array = {
                {10}
        };
        int result = MatrixSum.sum(array);
        int expected = 10;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenTwo() {
        int[][] array = {
                {1, 2},
                {1, 2}
        };
        int result = MatrixSum.sum(array);
        int expected = 6;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenThree() {
        int[][] array = {
                {1, 2, 1},
                {1, 2, 0}
        };
        int result = MatrixSum.sum(array);
        int expected = 7;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayWithNegativeNumber() {
        int[][] array = {
                {5, 3, -2, 4},
                {3, -7, 4, 1},
                {2, 8}
        };
        int result = MatrixSum.sum(array);
        int expected = 21;
        Assert.assertEquals(expected, result);
    }
}