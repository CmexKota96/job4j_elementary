package ru.job4j.calculator;
import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumDifAndDegree(double first, double second) {
        return dif(first, second)
                + degree(first, second);
    }

    public static double sumAllFunction(double first, double second) {
        return sum(first, second) + multiply(first, second)
                + dif(first, second) + degree(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета sumAndMultiply равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета sumDifAndDegree равен: " + sumDifAndDegree(10, 20));
        System.out.println("Результат расчета sumAllFunction равен: " + sumAllFunction(10, 20));
    }
}
