package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    void sumStart5Finish10ThenExpected45() {
        int start = 5;
        int finish = 10;
        int expected = 45;
        int output = Counter.sum(start,finish);
        assertThat(output == expected).isTrue();
    }

    @Test
    void sumStart10Finish5ThenExpected0() {
        int start = 10;
        int finish = 5;
        int expected = 0;
        int output = Counter.sum(start,finish);
        assertThat(output == expected).isTrue();
    }

    @Test
    void sumStartMinus1FinishMinus5ThenExpected0() {
        int start = -1;
        int finish = -5;
        int expected = 0;
        int output = Counter.sum(start,finish);
        assertThat(output == expected).isTrue();
    }
}