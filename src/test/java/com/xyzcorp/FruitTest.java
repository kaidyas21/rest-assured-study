package com.xyzcorp;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class FruitTest {
    //Rest-Assured
   //
    @Test
    public void testGetFruits(){
        given()
                .accept(ContentType.JSON)
                .when()
                .get("https://staging.tiered-planet.net/mild-temper/fruits")
                .then()
                .assertThat()
                .body("[0].description" ,equalTo("Winter fruit"));
    }
}