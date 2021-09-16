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
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        float euro = Converter.rubleToEuro(350);
        float dollar = Converter.rubleToDollar(1700);
        System.out.println("140 рублей это 2 евро. Результат теста: " + passed);
        in = 180;
        expected = 3;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("180 рублей это 3 доллара. Результат теста: " + passed);
        System.out.println("350 рублей это: " + euro + " евро.");
        System.out.println("1700 рублей это: " + dollar + " долларов.");
    }
}
