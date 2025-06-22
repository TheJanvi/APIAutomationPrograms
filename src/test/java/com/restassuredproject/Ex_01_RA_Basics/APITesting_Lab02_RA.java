package com.restassuredproject.Ex_01_RA_Basics;

import io.restassured.RestAssured;

import java.util.Scanner;

public class Lab02_RA {
    public static void main(String[] args) {

        //Gherkin Syntax
        //Given() -> pre req. -> URL, Headers, Auth, Body....
        //When() -> HTTP method? - GET/ POST/ PATCH/ PUT/ DELETE
        //Then() -> Validation -> 200O OK, firstname == PROMOD

        //Full URL -> https://api.zippopotam.us/IN/560016
        //base URL -> https://api.zippopotam.us
        //base Path > /IN/560016

        Scanner SC = new Scanner(System.in);
        System.out.println("Enter a Pincode!");
        String pincode = SC.next();

        RestAssured.given()
                      .baseUri("https://api.zippopotam.us")
                      .basePath("/IN/" + pincode)
                   .when()
                      .get()
                .then().log().all()
                        .statusCode(200);

        //Headers, Cookies, Response Body, ... Others.
    }
}
