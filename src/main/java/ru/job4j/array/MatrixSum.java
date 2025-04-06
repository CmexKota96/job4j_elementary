package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            for (int cell = 0; cell < array[i].length; cell++) {
                result += array[i][cell];
            }
        }
        return result;
    }
}
