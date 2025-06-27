package com.restassuredproject.Tasks.Restful_Booker_Allure_Report;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Delete_Booking_DELETE {


    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableResponse;




    @Test
    public void Delete_Booking_DELETE(){
        String token = BaseTestData.token;
        int bookingId = BaseTestData.bookingId;

        requestSpecification = RestAssured.given();
            requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/booking/" + bookingId);
            requestSpecification.contentType(ContentType.JSON);

            requestSpecification.cookie("token" , token);

            response = requestSpecification.when().log().all().delete();

            validatableResponse = response.then().log().all();


        validatableResponse.statusCode(201);
        }



}


