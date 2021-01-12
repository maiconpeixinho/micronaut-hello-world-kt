package com.maiconpeixinho.greetings;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/maiconpeixinho/greetings/GreetingsController;", "", "greetingsService", "Lcom/maiconpeixinho/greetings/GreetingsService;", "(Lcom/maiconpeixinho/greetings/GreetingsService;)V", "hello", "", "name", "micronaut-hello-world-kt"})
@io.micronaut.http.annotation.Controller(value = "/")
public final class GreetingsController {
    private final com.maiconpeixinho.greetings.GreetingsService greetingsService = null;
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get(value = "/hello/{name}")
    public final java.lang.String hello(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    public GreetingsController(@org.jetbrains.annotations.NotNull()
    com.maiconpeixinho.greetings.GreetingsService greetingsService) {
        super();
    }
}