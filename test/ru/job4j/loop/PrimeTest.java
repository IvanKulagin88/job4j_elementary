package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class PrimeTest {
    @Test
    public void when5() {
        int count = Prime.calc(5);
        assertThat(count, is(3));
    }

    @Test
    public void when11() {
        int count = Prime.calc(11);
        assertThat(count, is(5));
    }

    @Test
    public void when2() {
        int count = Prime.calc(2);
        assertThat(count, is(1));
    }
}