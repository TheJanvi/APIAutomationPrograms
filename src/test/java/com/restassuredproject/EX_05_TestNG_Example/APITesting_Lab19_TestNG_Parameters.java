package com.restassuredproject.EX_05_TestNG_Example;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class APITesting_Lab19_TestNG_Parameters {

    @Parameters("browser")
    @Test
    public void demo1(String browser){
        System.out.println("i am demo");
        System.out.println("You are running this param");

        if (browser.equalsIgnoreCase("firefox")){
            System.out.println("Start the firefox");
        }
        if (browser.equalsIgnoreCase("chrome")){
            System.out.println("Start the chrome");
        }

    }



}
