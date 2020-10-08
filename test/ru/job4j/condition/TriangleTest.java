package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void triangleExistTest() {
        assertFalse(Triangle.exist(1., 3., 5.));
        assertTrue(Triangle.exist(2., 2., 2.));
    }

}