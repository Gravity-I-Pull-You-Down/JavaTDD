package com.company;

import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest {

    @Test
    public void Add0() throws Exception {
        StringCalculator strclc = new StringCalculator();
        String str = "";
        int answer = strclc.Add(str);
        Assert.assertEquals(0,answer);
    }
    @Test
    public void Add1() throws Exception {
        StringCalculator strclc = new StringCalculator();
        String str = "1";
        int answer = strclc.Add(str);
        Assert.assertEquals(1,answer);
    }
    @Test
    public void Add12() throws Exception {
        StringCalculator strclc = new StringCalculator();
        String str = "1,2";
        int answer = strclc.Add(str);
        Assert.assertEquals(3,answer);
    }
    @Test
    public void AddUnknown() throws Exception {
        StringCalculator strclc = new StringCalculator();
        String str = "5,5,5,5,5";
        int answer = strclc.Add(str);
        Assert.assertEquals(25,answer);
    }
    @Test
    public void AddUnknown2() throws Exception {
        StringCalculator strclc = new StringCalculator();
        String str = "5,4,3,2,1";
        int answer = strclc.Add(str);
        Assert.assertEquals(15,answer);
    }
    @Test
    public void Addnextline() throws Exception {
        StringCalculator strclc = new StringCalculator();
        String str = "5\n4\n3\n2\n1";
        int answer = strclc.Add(str);
        Assert.assertEquals(15,answer);
    }
//    @Test(expected = NumberFormatException.class)
    @Test
    public void AddNegative() throws Exception {
        StringCalculator strclc = new StringCalculator();
        String str = "5,4,-3,-2\n1";
        int answer = strclc.Add(str);
//        Assert.assertEquals(15,answer);
    }
    @Test
    public void Adddelimiter() throws Exception {
        StringCalculator strclc = new StringCalculator();
        String str = "//;\n1;2";
        int answer = strclc.Add(str);
        Assert.assertEquals(3,answer);
    }
    @Test
    public void Counter(){
        StringCalculator strclc = new StringCalculator();
        int answer = strclc.GetCalledCount(); 
        Assert.assertEquals(8,answer);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme