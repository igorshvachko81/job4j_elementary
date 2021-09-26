package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];

        names[0] = "Igor";
        names[1] = "Boris";
        names[2] = "Olga";
        names[3] = "Amelia";

        System.out.println("Size of array ages: " + ages.length);
        System.out.println("Size of array surnames: " + surnames.length);
        System.out.println("Size of array prices: " + prices.length);
        System.out.println("1. " + names[0]);
        System.out.println("2. " + names[1]);
        System.out.println("3. " + names[2]);
        System.out.println("4. " + names[3]);
    }
}
