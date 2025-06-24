package com.restassuredproject.EX_05_TestNG_Example;

import org.testng.annotations.Test;

public class APITesting_Lab16_Priority {


@Test (priority = 1)
    public void Test1(){
        System.out.println("t1 ");
    }
    @Test (priority = 3)
    public void Test4(){
        System.out.println("t3 ");
    }
    @Test (priority = 4)
    public void Test2(){
        System.out.println("t4 ");
    }
    @Test (priority = 2)
    public void Test3(){
        System.out.println("t2");
    }

}
