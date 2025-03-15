package ru.job4j.loop;

public class Savings {
    public static int years(double goal, double annualDeposit, double percent) {
        int years = 0;
        double total = 0;
        do {
            total += annualDeposit + total * (percent / 100);
            years++;
        } while (total < goal);
        return years;
    }
}
//где goal — целевая сумма, которую нужно накопить,
//annualDeposit — ежегодное пополнение,
// percent — процентная ставка по вкладу.