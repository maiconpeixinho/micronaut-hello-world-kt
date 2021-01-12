package com.maiconpeixinho;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0007R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lcom/maiconpeixinho/HelloControllerTest;", "", "()V", "helloClient", "Lcom/maiconpeixinho/HelloClient;", "getHelloClient", "()Lcom/maiconpeixinho/HelloClient;", "setHelloClient", "(Lcom/maiconpeixinho/HelloClient;)V", "testGreetingService", "", "micronaut-hello-world-kt"})
@io.micronaut.test.extensions.junit5.annotation.MicronautTest()
public final class HelloControllerTest {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.maiconpeixinho.HelloClient helloClient;
    
    @org.jetbrains.annotations.NotNull()
    public final com.maiconpeixinho.HelloClient getHelloClient() {
        return null;
    }
    
    public final void setHelloClient(@org.jetbrains.annotations.NotNull()
    com.maiconpeixinho.HelloClient p0) {
    }
    
    @org.junit.jupiter.api.Test()
    public final void testGreetingService() {
    }
    
    public HelloControllerTest() {
        super();
    }
}