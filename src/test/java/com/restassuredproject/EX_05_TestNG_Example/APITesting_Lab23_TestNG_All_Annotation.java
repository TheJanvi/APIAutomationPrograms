package com.restassuredproject.EX_05_TestNG_Example;

import org.testng.annotations.*;

public class APITesting_Lab23_TestNG_All_Annotation {

    @BeforeSuite
    public void demo1(){
        System.out.println("BeforeSuite");
    }
    @BeforeTest
    public void demo2(){
        System.out.println("BeforeTest");
    }
    @BeforeClass
    public void demo3(){
        System.out.println("BeforeClass");
    }

    @BeforeMethod
    public void demo4(){
        System.out.println("BeforeMethod");
    }
    @Test
    public void demo5(){
        System.out.println("Test");
    }
    @AfterMethod
    public void demo6(){
        System.out.println("AfterMethod");
    }
    @AfterClass
    public void demo7(){
        System.out.println("AfterClass");
    }
    @AfterTest
    public void demo8(){
        System.out.println("AfterTest");
    }
    @AfterSuite
    public void demo9(){
        System.out.println("AfterSuite");
    }












}
