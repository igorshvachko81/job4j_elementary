package ru.job4j.loop;

public class Factorial {
    public static int calc(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result = result * i;
        }
        return result;
    }
}
