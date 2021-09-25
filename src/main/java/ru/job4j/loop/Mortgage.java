package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        if (salary <= (amount * (percent / 100))) {
            System.out.println("Вы не сможете выплатить кредит на этих условиях.");
            year = -1;
        } else {
            while (amount > 0) {
                amount = (amount + (amount * (percent / 100))) - salary;
                year++;
            }
        }
        System.out.println("Вам потребуется: " + year + " лет.");
        return year;
    }
}