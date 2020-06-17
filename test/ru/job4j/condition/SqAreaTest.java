package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void square() {
int p = 6;
int k = 2 ;
        double expected = 2;
        double rsl = SqArea.square(p,k);
        assertThat(rsl, is(expected));
    }
}