package ru.job4j.condition;

public class Max {
    public double max(double first, double second) {
        return first > second ? first : second;
    }

    public double max(double first, double second, double third) {
        return max(first, second) > third ? max(first, second) : third;
    }

    public double max(double first, double second, double third, double fourth) {
        return max(first, second, third) > fourth ? max(first, second, third) : fourth;
    }

    public int max(int first, int second) {
        return first > second ? first : second;
    }

    public int max(int first, int second, int third) {
        return max(first, second) > third ? max(first, second) : third;
    }

    public int max(int first, int second, int third, int fourth) {
        return max(first, second, third) > fourth ? max(first, second, third) : fourth;
    }
}
