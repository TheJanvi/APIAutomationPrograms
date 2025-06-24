package com.restassuredproject.Ex_04_RA_HTTP_Method_.PATCH;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting012_PATCH_NONBddStyle {

    // PATCH

    // token, booking id - A

//    public void get_token(){ }
//    public void get_booking_id(){}

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    public void test_put_non_bdd() {

        String token = "c6e084c8cdfebd8";
        String bookingid = "1519";

        String payloadPUT = "{\n" +
                "    \"firstname\" : \" Lucky\",\n" +
                "    \"lastname\" : \"Dutta\"}";


        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/" + bookingid);
        r.contentType(ContentType.JSON);
//        r.auth().oaut
        r.cookie("token", token);
        r.body(payloadPUT).log().all();

        response = r.when().log().all().patch();

        vr= response.then().log().all();
        vr.statusCode(200);


    }

}
