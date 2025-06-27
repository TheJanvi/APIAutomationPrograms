package com.restassuredproject.Ex_07_Payload_Management.HashMap;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import  java.util.LinkedHashMap;
import  java.util.Map;
import java.util.Objects;

public class APITesting_28_RestAssured_Payload_Map {

    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableResponse;
    String token;
    Integer bookingId;

    @Test
    public void test_POST(){
        //String payload="{\n" +
        //                "    \"firstname\" : \"Jim\",\n" +
        //                "    \"lastname\" : \"Brown\",\n" +
        //                "    \"totalprice\" : 111,\n" +
        //                "    \"depositpaid\" : true,\n" +
        //                "    \"bookingdates\" : {\n" +
        //                "        \"checkin\" : \"2018-01-01\",\n" +
        //                "        \"checkout\" : \"2019-01-01\"\n" +
        //                "    },\n" +
        //                "    \"additionalneeds\" : \"Breakfast\"\n" +
        //                "}";



            //Hashmap -> key and value

        Map<String, Object> jsonBodyUsingMap = new LinkedHashMap<>();
        jsonBodyUsingMap.put("firstname", "Jennie");
        jsonBodyUsingMap.put("lastname", "Gogia");
        jsonBodyUsingMap.put("totalprice", 123);
        jsonBodyUsingMap.put("depositpaid", false);

        Map<String, Object> bookingDateMap = new LinkedHashMap<>();
        bookingDateMap.put("checkin", "2018-01-01");
        bookingDateMap.put("checkout", "2019-01-01");

        jsonBodyUsingMap.put("bookingdates", bookingDateMap);
        jsonBodyUsingMap.put("additionalneeds", "Breakfast");
        System.out.println(jsonBodyUsingMap);

        //hashmap -> json
        // Two library
            // 1. gson
            // 2. jackson API


        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/booking");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(jsonBodyUsingMap).log().all();

        response = requestSpecification.when().post();

        validatableResponse = response.then().log().all();

        validatableResponse.statusCode(200);

        //Rest Assured -> import org.hamcrest.Matcher; - 4% - 5%

        validatableResponse.body("booking.firstname", Matchers.equalTo("Jennie"));
        validatableResponse.body("booking.lastname",Matchers.equalTo("Gogia"));
        validatableResponse.body("booking.depositpaid", Matchers.equalTo(false));
        validatableResponse.body("bookingid",Matchers.notNullValue());


    }












}
