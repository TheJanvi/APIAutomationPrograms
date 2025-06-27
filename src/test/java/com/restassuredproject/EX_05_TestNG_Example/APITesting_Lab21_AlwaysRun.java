package com.restassuredproject.EX_05_TestNG_Example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting_Lab21_AlwaysRun {

    @Test(alwaysRun = true)
    public void test_new_Registration(){
        Assert.assertTrue(true);
    }
    @Test
    public void test_loginPage(){
        Assert.assertTrue(true);
    }
    @Test
    public void test_normal(){
        Assert.assertTrue(true);
    }
}
