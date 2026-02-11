package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void whenPoints21And32Then1Dot41() {
        int x1 = 2, y1 = 1, x2 = 3, y2 = 2;
        double expected = 1.41;
        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus3Minus4And2And3Then8Dot60() {
        int x1 = -3, y1 = -4, x2 = 2, y2 = 3;
        double expected = 8.60;
        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus2Minus2And2And2Then5Dot66() {
        int x1 = -2, y1 = -2, x2 = 2, y2 = 2;
        double expected = 5.66;
        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPoints1And2And3And2And4And6Then3Dot74() {
        int x1 = 1, y1 = 2, z1 = 3, x2 = 2, y2 = 4, z2 = 6;
        double expected = 3.74;
        Point a = new Point(x1, y1, z1);
        Point b = new Point(x2, y2, z2);
        double output = a.distance3d(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus2Minus3Minus5And2And4And6Then13Dot63() {
        int x1 = -2, y1 = -3, z1 = -5, x2 = 2, y2 = 4, z2 = 6;
        double expected = 13.63;
        Point a = new Point(x1, y1, z1);
        Point b = new Point(x2, y2, z2);
        double output = a.distance3d(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

}