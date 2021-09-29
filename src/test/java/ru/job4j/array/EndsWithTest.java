package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class EndsWithTest {
    @Test
    public void whenEndWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o', 'w', 'e', 'e', 'n'};
        char[] post = {'w', 'e', 'e', 'n'};
        boolean result = EndsWith.endsWith(word, post);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNotEndWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'a'};
        boolean result = EndsWith.endsWith(word, post);
        Assert.assertFalse(result);
    }
}
