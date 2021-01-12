package com.maiconpeixinho.greetings

import javax.inject.Singleton

@Singleton
class GreetingsService {
    fun hello(name: String) = "Hello $name"
}