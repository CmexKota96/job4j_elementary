package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void whenPoints21And32Then1Dot41() {
        int x1 = 2, y1 = 1, x2 = 3, y2 = 2;
        double expected = 1.41;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus3Minus4And2And3Then8Dot60() {
        int x1 = -3, y1 = -4, x2 = 2, y2 = 3;
        double expected = 8.60;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus2Minus2And2And2Then5Dot66() {
        int x1 = -3, y1 = -2, x2 = 2, y2 = 2;
        double expected = 5.66;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}