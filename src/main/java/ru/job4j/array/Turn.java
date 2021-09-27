package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int middleArray;
        if (array.length % 2 == 0) {
            middleArray = array.length / 2;
            } else {
            middleArray = (array.length - 1) / 2;
        }
        for (int i = 0; i < middleArray; i++) {
            int tempo = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tempo;
        }
        return array;
    }

    public static int[] backNumberTwo(int[] array) {
        if (array.length % 2 == 0) {
            for (int i = 0; i < array.length / 2; i++) {
                int tempo = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = tempo;
            }
        } else {
            for (int i = 0; i < (array.length - 1) / 2; i++) {
                int tempo = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = tempo;
            }
        }
        return array;
    }

}
