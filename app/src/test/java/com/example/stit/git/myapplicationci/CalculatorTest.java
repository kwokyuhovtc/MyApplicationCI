package com.example.stit.git.myapplicationci;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void add_test(){
        Calculator c = new Calculator();
        int result = c.add(2, 2);
        Assert.assertEquals(4, result);
    }

    @Test
    public void substract_test(){
        Calculator c = new Calculator();
        int result = c.substract(2, 2);
        Assert.assertEquals(0, result);
    }
}
