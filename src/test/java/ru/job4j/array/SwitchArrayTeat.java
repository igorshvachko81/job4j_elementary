package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class SwitchArrayTeat {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap1to1() {
        int[] input = {1, 2, 3, 4};
        int source = 1;
        int dest = 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 3, 4};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap0to4() {
        int[] input = {1, 2, 3, 4, 8};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {8, 2, 3, 4, 1};
        Assert.assertArrayEquals(expected, result);
    }
}
