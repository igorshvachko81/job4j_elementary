package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(350);
        float dollar = Converter.rubleToDollar(1700);
        System.out.println("350 рублей это: " + euro + " евро.");
        System.out.println("1700 рублей это: " + dollar + " долларов.");
    }
}
