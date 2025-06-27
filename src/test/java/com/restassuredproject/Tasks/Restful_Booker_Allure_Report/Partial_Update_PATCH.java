package com.restassuredproject.Tasks.Restful_Booker_Allure_Report;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Partial_Update_PATCH {

    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableResponse;


     String payload= "{\n" +
             "    \"firstname\" : \"James\",\n" +
             "    \"lastname\" : \"GOGIYA P.\"\n" +
             "}";

@Test
            public void Partial_Update_PATCH(){
              String token = BaseTestData.token;
              int bookingId = BaseTestData.bookingId;

                requestSpecification = RestAssured.given();
                requestSpecification.baseUri("https://restful-booker.herokuapp.com");
                requestSpecification.basePath("/booking/" + bookingId);
                requestSpecification.contentType(ContentType.JSON);
                requestSpecification.body(payload);
                requestSpecification.cookie("token", token);

                response = requestSpecification.when().patch();

                validatableResponse = response.then().log().all();
                validatableResponse.statusCode(200);
            }



}
