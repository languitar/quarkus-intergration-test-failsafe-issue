package org.acme.rest

import io.quarkus.test.junit.QuarkusIntegrationTest
import io.restassured.RestAssured.given
import org.hamcrest.CoreMatchers.`is`
import org.junit.jupiter.api.Test
import javax.inject.Inject

@QuarkusIntegrationTest
class GreetingResourceIT {

    @Test
    fun testHelloEndpoint() {
        given()
            .`when`().get("/greeting")
            .then()
            .statusCode(200)
            .body(`is`("Hello RESTEasy"))
    }

}
