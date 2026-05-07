package org.example.maven.services;

public class VacationService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счет

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                count++;
                money = money - expenses;
                money = money / 3;
            } else {
                // Решаем работать
                money = money + income - expenses;
            }
        }
        return count;
    }
}

