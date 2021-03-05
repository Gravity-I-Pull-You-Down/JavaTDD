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
    @Test
    public void AddUnknown() {
        StringCalculator strclc = new StringCalculator();
        String str = "5,5,5,5,5";
        int answer = strclc.Add(str);
        Assert.assertEquals(25,answer);
    }
    @Test
    public void AddUnknown2() {
        StringCalculator strclc = new StringCalculator();
        String str = "5,4,3,2,1";
        int answer = strclc.Add(str);
        Assert.assertEquals(15,answer);
    }
    @Test
    public void Addnextline() {
        StringCalculator strclc = new StringCalculator();
        String str = "5\n4\n3\n2\n1";
        int answer = strclc.Add(str);
        Assert.assertEquals(15,answer);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme