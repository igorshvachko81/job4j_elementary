package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 187;
        double manIdealWeight = Fit.manWeight(height);
        double womanIdealWeight = Fit.womanWeight(height);
        System.out.println("For man height 187, ideal weight is: " + manIdealWeight);
        System.out.println("For woman height 187, ideal weight is: " + womanIdealWeight);
    }
}
