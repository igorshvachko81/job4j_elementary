package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenLeft5AndRight8Max8() {
        int left = 5;
        int right = 8;
        int expected = 8;
        int result = Max.max(left, right);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenLeftGreaterThanRight() {
        int left = 15;
        int right = 11;
        String expected = "left";
        String res = Max.max(left, right) == left ? "left" : "right";
        System.out.println("The greater number is: " + res);
        Assert.assertEquals(expected, res);
    }

    @Test
    public void whenRightGreaterThanLeft() {
        int left = 8;
        int right = 11;
        String expected = "right";
        String res = Max.max(left, right) == right ? "right" : "left";
        System.out.println("The greater number is: " + res);
        Assert.assertEquals(expected, res);
    }

    @Test
    public void whenLeftEqualsRight() {
        int left = 8;
        int right = 8;
        String expected = "Equals";
        String result = (Max.max(left, right) == left && Max.max(left, right) == right) ? "Equals" : "Not equals";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenNumbersEquals() {
        int left = 11;
        int right = 11;
        int expected = 11;
        int maximum = Max.max(left, right);
        int result = (maximum == left && maximum == right) ? left : maximum;
        Assert.assertEquals(expected, result);
    }
}
