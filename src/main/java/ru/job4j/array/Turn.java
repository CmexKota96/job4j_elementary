package ru.job4j.array;

public class Turn {
    @SuppressWarnings("checkstyle:WhitespaceAround")
    public static int[] back(int[] array) {
        int temp;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }
}
