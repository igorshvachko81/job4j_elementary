package ru.job4j.condition;

public class Liken {
    public static void main(String[] args) {
        int first = 10;
        int second = 9;
        boolean result1 = first > second;
        System.out.println("first больше second: " + result1);
        boolean result2 = first < second;
        System.out.println("first меньше second: " + result2);
        boolean result3 = first == second;
        System.out.println("first равно second: " + result3);
    }
}
