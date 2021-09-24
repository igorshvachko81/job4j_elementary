package ru.job4j.loop;

import org.junit.Test;
import org.junit.Assert;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int number = 5;
        int expected = 120;
        int factorialCalc = Factorial.calc(number);
        Assert.assertEquals(expected, factorialCalc);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int number = 0;
        int expected = 1;
        int factorialCalc = Factorial.calc(number);
        Assert.assertEquals(expected, factorialCalc);
    }
}
