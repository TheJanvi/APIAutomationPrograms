package com.restassuredproject.EX_05_TestNG_Example;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class APITesting_Lab15_Before_test {

// PUT Request -
// 1. getToken
// 2. getBookingId
//3. test_PUT //(which will use the above two methods)
// 4. closeAllThings
    @BeforeTest
    public void getToken(){
            System.out.println("1");
    }
    @BeforeTest
    public void getBookingIDo() {
    System.out.println("2");

    }
    @Test
    public void test_PUT(){
// token and BookingID
    System.out.println("3");
    }

    @AfterTest
    public void CloseAllThing(){
        System.out.println("Close");
    }








}
