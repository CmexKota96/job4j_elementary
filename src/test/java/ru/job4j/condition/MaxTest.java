package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class MaxTest {

    @Test
    void first1second3() {
        int expected = 3;
        Max a = new Max();
        int max = a.max(1, 3);
        assertThat(max).isEqualTo(expected);
    }

    @Test
    void first4second3() {
        int expected = 4;
        Max a = new Max();
        int max = a.max(4, 3);
        assertThat(max).isEqualTo(expected);
    }

    @Test
    void first4second3third6() {
        int expected = 6;
        Max a = new Max();
        int max = a.max(4, 3, 6);
        assertThat(max).isEqualTo(expected);
    }

    @Test
    void first4second3third6fourth9() {
        int expected = 9;
        Max a = new Max();
        int max = a.max(4, 3, 6, 9);
        assertThat(max).isEqualTo(expected);
    }

    @Test
    void first5dot3second2dot5third12dot3fourth2dot1() {
        double expected = 12.3;
        Max a = new Max();
        double max = a.max(5.3, 2.5, 12.3, 2.1);
        assertThat(max).isEqualTo(expected);
    }
}