package ru.job4j.loop;

import ru.job4j.condition.LogicNot;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int count = start; count <= finish; count++) {
            sum = sum + count;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int count = start; count <= finish; count++) {
            if (LogicNot.isEven(count)) {
                sum = sum + count;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Amount sum from 0 to 10 is: " + sum(0, 10));
        System.out.println("Amount sum from 3 to 8 is: " + sum(3, 8));
        System.out.println("Amount sum from 1 to 1 is: " + sum(1, 1));
        System.out.println("Amount sum from 4 to 11 is: " + sum(4, 11));
        System.out.println("Amount sum from -5 to 5 is: " + sum(-5, 5));

        System.out.println("Amount even sum from 0 to 10 is: " + sumByEven(0, 10));
        System.out.println("Amount even sum from 3 to 8 is: " + sumByEven(3, 8));
        System.out.println("Amount even sum from 1 to 1 is: " + sumByEven(1, 1));
    }
}
