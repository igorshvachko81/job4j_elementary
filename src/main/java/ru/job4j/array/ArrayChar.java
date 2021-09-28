package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        int index = 0;
        while (index < pref.length) {
            if (pref[index] != word[index]) {
                result = false;
                break;
            }
            index++;
        }
        return result;
    }
}
