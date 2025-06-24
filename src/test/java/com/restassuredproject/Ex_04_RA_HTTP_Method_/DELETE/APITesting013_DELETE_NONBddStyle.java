package com.restassuredproject.Ex_04_RA_HTTP_Method_.DELETE;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting013_DELETE_NONBddStyle {

    // DELETE

    // token, booking id - A

//    public void get_token(){ }
//    public void get_booking_id(){}

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    public void test_put_non_bdd() {

        String token = "00369b6178a5c6c";
        String bookingid = "1230,";



        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/" + bookingid);
        r.contentType(ContentType.JSON);
//
        r.cookie("token", token);

        response = r.when().log().all().delete();

        vr= response.then().log().all();
        vr.statusCode(201);


    }

}
