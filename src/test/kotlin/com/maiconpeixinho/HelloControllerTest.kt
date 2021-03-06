package com.maiconpeixinho

import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test
import javax.inject.Inject

@MicronautTest
class HelloControllerTest {

    @Inject
    lateinit var helloClient: HelloClient

    @Test
    fun testGreetingService(){
        assertEquals(
            "Hello Maicon",
            helloClient.hello("Maicon").blockingGet()
        )
    }
}