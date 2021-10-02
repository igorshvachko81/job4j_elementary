package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        int shift = 1;
        for (int indexNull = 0; indexNull < array.length; indexNull++) {
            if (array[indexNull] == null) {
                int pointNull = indexNull + shift;
                for (int indexNotNull = pointNull; indexNotNull < array.length; indexNotNull++) {
                    if (array[indexNotNull] != null) {
                        array = SwitchArray.swapStringArray(array, indexNull, indexNotNull);
                        shift = indexNotNull - indexNull;
                        break;
                    }
                    if (indexNotNull + 1 == array.length) {
                        indexNull = indexNotNull;
                    }
                }
            }
        }
        return array;
    }
}
