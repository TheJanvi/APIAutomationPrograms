package com.restassuredproject.EX_05_TestNG_Example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting_Lab18_dependsonMethod {

    @Test
    public void serverStartok(){
        System.out.println("I will run First");
        Assert.assertTrue(true);
    }
    @Test (dependsOnMethods = "serverStartok")
    public void Test1(){
        System.out.println("method1");
        Assert.assertTrue(true);
    }
    @Test (dependsOnMethods = "serverStartok")
    public void Test2(){
        System.out.println("method2");
        Assert.assertTrue(true);
    }






}
