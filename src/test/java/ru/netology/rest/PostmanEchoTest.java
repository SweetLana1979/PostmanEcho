package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

class PostmanEchoTest {

    @Test
    void shouldReturnDataSent() {
               given()
                .baseUri("https://postman-echo.com")
                .body("Make Love,Not War")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo ("Make a Pie,Not War"))
        ;
    }
}
