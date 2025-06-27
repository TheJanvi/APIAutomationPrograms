package com.restassuredproject.EX_05_TestNG_Example;

import org.testng.annotations.Test;

public class APITesting_Lab22_TestNg_InvocationCount {
    @Test(invocationCount = 2)
    public void test01(){
        System.out.println("Hi");
    }
    @Test(invocationCount = 3)
    public void test02(){
        System.out.println("bye");
    }
    @Test
    public void test03(){
        System.out.println("ok");
    }

}
