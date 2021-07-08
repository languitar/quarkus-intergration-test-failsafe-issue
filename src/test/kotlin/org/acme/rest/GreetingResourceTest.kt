package org.acme.rest

import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured.given
import org.hamcrest.CoreMatchers.`is`
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import javax.inject.Inject
import javax.transaction.Transactional

@QuarkusTest
class GreetingResourceTest {

    @Inject
    lateinit var repo: FooEntityRepo

    @BeforeEach
    @AfterEach
    @Transactional
    fun clearDatabase() {

    }

    @Test
    @Transactional
    fun testHelloEndpoint() {
        given()
            .`when`().get("/greeting")
            .then()
            .statusCode(200)
            .body(`is`("Hello RESTEasy"))
    }

}
