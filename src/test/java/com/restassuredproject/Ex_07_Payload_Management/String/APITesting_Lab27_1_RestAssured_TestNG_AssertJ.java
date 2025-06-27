package com.restassuredproject.Ex_07_Payload_Management.String;

import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import jdk.jfr.Description;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;


@Owner("Jahnvi")
@Severity(SeverityLevel.CRITICAL)
@Description("TC#1 - Verify tht the create booking is working fine, booking ID is not null")
@Test
public class APITesting_Lab27_1_RestAssured_TestNG_AssertJ {

    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableResponse;

    Integer bookingId;
    String token ;

    @Test
    public void  test_createBooking_POST(){
        String payload="{\n" +
                "    \"firstname\" : \"Jim\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";

        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/booking");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(payload).log().all();

        response = requestSpecification.when().post();

        validatableResponse = response.then().log().all();

        validatableResponse.statusCode(200);

        //Rest Assured -> import org.hamcrest.Matcher; - 4% - 5%

        validatableResponse.body("booking.firstname", Matchers.equalTo("Jim"));
        validatableResponse.body("booking.lastname",Matchers.equalTo("Brown"));
        validatableResponse.body("booking.depositpaid", Matchers.equalTo(true));
        validatableResponse.body("bookingid",Matchers.notNullValue());


        //TestNG - extract the details of the firstname, lastname, bookingID from response.

        bookingId = response.then().extract().path("bookingid");
        String firstname = response.then().extract().path("booking.firstname");
        String lastname = response.then().extract().path("booking.lastname");


        //TestNG Assertions - 75%
        //SoftAssert VS
        //HardAssert -
        //This means that if nay assertion fails,
        //the remaining statements in that test method will not be executed.
        Assert.assertEquals(firstname, "Jim");
        Assert.assertEquals(lastname, "Brown");
        Assert.assertNotNull(bookingId);

        //AssertJ (lib - assertion) - 20%

        assertThat(bookingId).isNotNull().isPositive().isNotZero();
        //String s = ""; Empty
        //String s =" "; Blank









    }


}



