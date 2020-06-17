package ru.job4j.calculator;


import org.junit.Assert;



import org.junit.Test;



public class FitTest {

    @Test
    public void  manWeight(double height) {
        short in = 187;
        double expected = 100.05;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void womanWeight(double height) {

        short  in = 187;
        double expected = 100.05;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);

    }
}