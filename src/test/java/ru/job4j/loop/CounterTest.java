package ru.job4j.loop;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Disabled
    @Test
    void sumStart5Finish10ThenExpected45() {
        int start = 5;
        int finish = 10;
        int expected = 45;
        int output = Counter.sum(start, finish);
        assertThat(output == expected).isTrue();
    }

    @Disabled
    @Test
    void sumStart10Finish5ThenExpected0() {
        int start = 10;
        int finish = 5;
        int expected = 0;
        int output = Counter.sum(start, finish);
        assertThat(output == expected).isTrue();
    }

    @Disabled
    @Test
    void sumStartMinus1FinishMinus5ThenExpected0() {
        int start = -1;
        int finish = -5;
        int expected = 0;
        int output = Counter.sum(start, finish);
        assertThat(output == expected).isTrue();
    }

    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinus5ToTenThen24() {
        int start = -5;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 24;
        assertThat(result).isEqualTo(expected);
    }
}