package com.restassuredproject.Tasks.Restful_Booker_Allure_Report;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Create_Token_POST {
    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableResponse;

    String payload = "{\n" +
            "    \"username\" : \"admin\",\n" +
            "    \"password\" : \"password123\"\n" +
            "}";



    @Test
    public void Create_Token_POST(){

        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/auth");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(payload).log().all();

        response = requestSpecification.when().post();

        validatableResponse = response.then().log().all();
        String token = response.then().extract().path("token");
        BaseTestData.token = token;
        validatableResponse.statusCode(200);



    }


}
