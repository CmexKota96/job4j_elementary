package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        char current = input.charAt(0);
        for (int i = 0; i < input.length(); i++) {
            current = input.charAt(i);
            if (current != symbol) {
                result += symbol;
                if (counter > 2) {
                    result += counter - 1;
                }
                symbol = current;
                counter = 1;
            }
            counter++;
        }
        result += current;
        if (counter > 2) {
            result += (--counter);
        }
        return result;
    }
}