package com.restassuredproject.Tasks.Restful_Booker_Allure_Report;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Full_Update_PUT {


        RequestSpecification requestSpecification;
        Response response;
        ValidatableResponse validatableResponse;


        String payload= "{\n" +
                "    \"firstname\" : \"Jon\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 1100,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2003-10-04\",\n" +
                "        \"checkout\" : \"2003-10-04\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"dinner\"}";

        @Test
        public void Full_Update_PUT(){
            String token = BaseTestData.token;
            int bookingId = BaseTestData.bookingId;

            requestSpecification = RestAssured.given();
            requestSpecification.baseUri("https://restful-booker.herokuapp.com");
            requestSpecification.basePath("/booking/" + bookingId);
            requestSpecification.contentType(ContentType.JSON);
            requestSpecification.body(payload);
            requestSpecification.cookie("token" , token).log().all();

            response = requestSpecification.when().put();

            validatableResponse = response.then().log().all();
            validatableResponse.statusCode(200);
        }



    }


