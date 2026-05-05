package org.example.maven.services;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.Assertions;

public class VacationServiceTest {

    @ParameterizedTest
    @CsvSource({
            // Формат: income, expenses, threshold, expected
            "10000, 3000, 20000, 3",   // Пример 1
            "100000, 60000, 150000, 2", // Пример 2
            "10000, 3000, 1000000, 0"   // Пример 3 (без денег)
    })
    void shouldCalculateVacationMonthsCorrectly(int income, int expenses, int threshold, int expected) {
        VacationService service = new VacationService();

        // Вызываем метод с параметрами из CSV
        int actual = service.calculate(income, expenses, threshold);

        // Проверяем результат
        Assertions.assertEquals(expected, actual);
    }
}
