package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00To20Then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when13To47Then5() {
        double expected = 5;
        int x1 = 1;
        int y1 = 3;
        int x2 = 4;
        int y2 = 7;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.001);
    }

    @Test
    public void when13To113Then10() {
        double expected = 10;
        int x1 = 1;
        int y1 = 3;
        int x2 = 11;
        int y2 = 3;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.001);
    }

    @Test
    public void when35To1210Then10and296() {
        double expected = 10.296;
        int x1 = 3;
        int y1 = 5;
        int x2 = 12;
        int y2 = 10;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.001);
    }
}
