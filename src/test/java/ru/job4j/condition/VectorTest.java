package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class VectorTest {

    @Test
    void whenVectors35And21ThenResult56() {
        int x1 = 3, y1 = 5, x2 = 2, y2 = 1;
        String expected = "(5, 6)";
        String output = Vector.addVectors(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenVectorsMinus32And1Minus4ThenResultMinus26() {
        int x1 = -3, y1 = -2, x2 = 1, y2 = -4;
        String expected = "(-2, -6)";
        String output = Vector.addVectors(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenVectorsMinus28AndMinus63ThenResultMinus811() {
        int x1 = -2, y1 = -8, x2 = -6, y2 = -3;
        String expected = "(-8, -11)";
        String output = Vector.addVectors(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected);

    }
}