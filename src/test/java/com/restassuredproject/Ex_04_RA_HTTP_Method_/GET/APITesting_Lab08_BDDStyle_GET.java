package com.restassuredproject.Ex_04_RA_HTTP_Method_.GET;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting_Lab08_BDDStyle_GET
{
   String pin_code = "362001";
    @Test
    public void test_GET_Positive(){
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" +pin_code)
                .when()
                .log()
                .all()
                .get()
                .then()
                .log().all()
                .statusCode(200);




    }





}
