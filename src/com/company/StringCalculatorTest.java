package com.company;

import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest {

    @Test
    public void Add0() {
        StringCalculator strclc = new StringCalculator();
        String str = "";
        int answer = strclc.Add(str);
        Assert.assertEquals(0,answer);
    }
    @Test
    public void Add1() {
        StringCalculator strclc = new StringCalculator();
        String str = "1";
        int answer = strclc.Add(str);
        Assert.assertEquals(1,answer);
    }
    @Test
    public void Add12() {
        StringCalculator strclc = new StringCalculator();
        String str = "1,2";
        int answer = strclc.Add(str);
        Assert.assertEquals(3,answer);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme