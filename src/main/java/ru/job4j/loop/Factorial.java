package ru.job4j.loop;

public class Factorial {
    public static int calc(int num) {
        int result = 1;
        if (num == 0 || num == 1) {
            return result;
        } else {
            for (int i = 1; i <= num; i++) {
                result = result * i;
            }
        }
        return result;
    }
}
