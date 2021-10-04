package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        int shift = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                int point = i + shift;
                for (int j = point; j < array.length; j++) {
                    if (array[j] != null) {
                        array = SwitchArray.swapStringArray(array, i, j);
                        shift = j - i;
                        break;
                    }
                    if (j + 1 == array.length) {
                        i = j;
                    }
                }
            }
        }
        return array;
    }
}
