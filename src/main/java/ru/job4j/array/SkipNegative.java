package ru.job4j.array;

public class SkipNegative {
    public static int[][] skip(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int cell = 0; cell < array[i].length; cell++) {
                if (array[i][cell] < 0) {
                    array[i][cell] = 0;
                }
            }
        }
        return array;
    }
}
