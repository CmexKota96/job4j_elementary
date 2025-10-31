package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        char currentSymbol = input.charAt(0);
        for (int i = 0; i < input.length(); i++) {
            currentSymbol = input.charAt(i);
            //boolean isLastSymbol = i == input.length() - 1;

            if (currentSymbol != symbol) {
                result += symbol;
                if (counter > 2) {
                    result += counter - 1;
                }
                symbol = currentSymbol;
                counter = 1;
            }
            counter++;
        }

        result += currentSymbol;
        if (counter > 2) {
            result += (--counter);
        }

        return result;
    }
}