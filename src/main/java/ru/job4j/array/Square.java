package ru.job4j.array;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class Square {
    @Contract(pure = true)
    public static int @NotNull [] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i < rst.length; i++) {
            rst[i] = i * i;
        }
        return rst;
    }

    public static void main(String[] args) {
        int[] array = calculate(5);
        for (int index : array) {
            System.out.print(index + " ");
        }
    }
}
