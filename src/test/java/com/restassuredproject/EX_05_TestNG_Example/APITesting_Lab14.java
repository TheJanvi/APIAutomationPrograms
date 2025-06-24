package com.restassuredproject.EX_05_TestNG_Example;

import org.testng.annotations.Test;

public class APITesting_Lab14 {



    public void test_without_annotation(){
        System.out.println("Normal Functin");
    }

    @Test
    public void test_with_annotation(){
        System.out.println("Runnable Test Function");
    }
}
