package com.restassuredproject.Ex_02_RA_Concepts;

public class APITesting_Lab04_BuildPattern
{

    public APITesting_Lab04_BuildPattern Step1(){
        System.out.println("Step 1");
        return this;
}
    public APITesting_Lab04_BuildPattern Step2(){
        System.out.println("Step 2");
        return this;
    }
    public APITesting_Lab04_BuildPattern Step3(String param1){
        System.out.println("Step 3");
        return this;
    }

    public static void main(String[] args) {
        APITesting_Lab04_BuildPattern bp = new APITesting_Lab04_BuildPattern();
        bp.Step1().Step2().Step3("Jennie");

    }
}
