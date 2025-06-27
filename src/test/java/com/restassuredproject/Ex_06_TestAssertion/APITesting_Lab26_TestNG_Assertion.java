package com.restassuredproject.Ex_06_TestAssertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class APITesting_Lab26_TestNG_Assertion {

    @Test (enabled = false)
    public void test_hardAssertExample(){
        System.out.println("Start of the program");
        Boolean is_neeru_male = false;
        Assert.assertEquals("pramod", "Pramod");
        System.out.println("End of the program");
    }

    @Test
    public void test_softAssertExample(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("Pramod", "Pramod");
        System.out.println("End of the program");
    }







}
