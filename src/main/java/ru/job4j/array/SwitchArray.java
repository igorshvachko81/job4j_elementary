package ru.job4j.array;

public class SwitchArray {
    public static int[] swap(int[] array, int source, int dest) {
        int tempo = array[source];
        array[source] = array[dest];
        array[dest] = tempo;
        return array;
    }

    public static String[] swapStringArray(String[] array, int source, int dest) {
        String tempo = array[source];
        array[source] = array[dest];
        array[dest] = tempo;
        return array;
    }

    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    public static void main(String[] args) {
        int[] numbers = new int[] {1, 2, 3, 4, 5, 6};
        int[] rsl = swapBorder(numbers);
        for (int i : rsl) {
            System.out.print(i + "; ");
        }
    }
}
