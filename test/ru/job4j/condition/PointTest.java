package ru.job4j.condition;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PointTest {



    @Test
    public void Distance() {
        int x1 = 0;
        int x2 = 0;
        int y1 = 0;
        int y2 = 2;
        int expected = 4;
        double out = Point.distance(0, 0, 2, 0);
        assertThat(out, is(expected));
    }
}