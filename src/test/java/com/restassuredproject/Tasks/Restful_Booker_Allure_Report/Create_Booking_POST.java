package com.restassuredproject.Tasks.Restful_Booker_Allure_Report;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Create_Booking_POST {
    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableResponse;

    String bookingId;
@Test
    public void Create_Booking_POST(){

        String payload = "{\n" +
                "    \"firstname\" : \"GOGIYA\",\n" +
                "    \"lastname\" : \"JANVI P.\",\n" +
                "    \"totalprice\" : 2003,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2003-10-03\",\n" +
                "        \"checkout\" : \"2003-10-03\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Lunch\"\n" +
                "}";

        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/booking");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(payload);



        response = requestSpecification.when().post();



        validatableResponse = response.then().log().all();
        int id = response.then().extract().path("bookingid");BaseTestData.bookingId = id;
        validatableResponse.statusCode(200);











    }




}
