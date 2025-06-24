package com.restassuredproject.EX_05_TestNG_Example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting_Lab17_TestNG_Groups {

    @Test (groups = {"sanity", "reg"} , priority = 1 )
    public void test_sanityRun(){
        System.out.println("Sanity");
        System.out.println("QA");
        Assert.assertTrue(true);
    }

    @Test (groups = { "reg"} , priority = 2)
    public void test_regRun(){
        System.out.println("reg");
        Assert.assertFalse(false);
    }
    @Test (groups = { "p1", "reg"}, priority = 3)
    public void test_smokeRun(){
        System.out.println("smoke");
        Assert.assertFalse(false);
    }






}
