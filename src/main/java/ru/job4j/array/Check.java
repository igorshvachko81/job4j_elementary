package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean example = data[0];
        boolean result = true;
        for (int x = 1; x < data.length; x++) {
            if (data[x] != example) {
                result = false;
                break;
            }
        }
        return result;
    }
}
