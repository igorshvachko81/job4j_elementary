package ru.job4j.condition;

public class DummyBot {
    public static String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            rsl = "Привет, умник.";
        } else if ("Пока.".equals(question)) {
            rsl = "До скорой встречи.";
        }
        return rsl;
    }

    public static void main(String[] args) {
        String greet = "Привет, Бот.";
        String bye = "Пока.";
        String tellMe = "Какая чудесная погода Бот.";
        System.out.println(greet);
        String rsl = DummyBot.answer(greet);
        System.out.println(rsl);
        System.out.println(tellMe);
        rsl = DummyBot.answer(tellMe);
        System.out.println(rsl);
        System.out.println(bye);
        rsl = DummyBot.answer(bye);
        System.out.println(rsl);
    }
}
