package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Размер массива ages равен: " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("Размер массива surnames равен: " + surnames.length);
        float[] prices = new float[40];
        System.out.println("Размер массива prices равен: " + prices.length);
        String[] names = new String[5];
        names[0] = "Dog";
        names[1] = "Cat";
        names[2] = "Frog";
        names[3] = "Snake";
        names[4] = "Eagle";
        for (String name : names) {
            System.out.println(name);
        }
    }
}
