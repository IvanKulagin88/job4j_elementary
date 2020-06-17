package ru.job4j.calculator;


import org.junit.Assert;



import org.junit.Test;



public class FitTest {

    @Test
    public static double manWeight(double height) {
        short in = 187;
        double expected = 100.05;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
return 0;
    }

    @Test
    public static double  womanWeight(double height) {

        short  in = 187;
        double expected = 100.05;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
return 0;
    }
}