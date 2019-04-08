package edu.cscc.topics.quality.integration;

import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class SimpleIT {
    @Test
    public void basicIntegrationTest() {
        /*
        rest-assured is one of a few choices of libraries you can use to integration test RESTful web services
         */

        // It follows the popular given/when/then pattern for structuring tests: https://en.wikipedia.org/wiki/Given-When-Then
        when().
                get("/hello"). // When I GET "/hello"
                then().
                statusCode(200). // I should see a status code 200
                    body("msg", equalTo("Hello World")); // and the JSON body that is returned should have a 'msg' attribute "Hello World"
    }
}
