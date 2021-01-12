package com.maiconpeixinho.greetings

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/")
class GreetingsController(
        private val greetingsService: GreetingsService
    ) {

    @Get("/hello/{name}")
    fun hello(name: String) = greetingsService.hello(name)
}