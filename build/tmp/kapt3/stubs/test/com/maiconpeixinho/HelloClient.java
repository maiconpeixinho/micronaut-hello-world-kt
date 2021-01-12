package com.maiconpeixinho;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\'\u00a8\u0006\u0006"}, d2 = {"Lcom/maiconpeixinho/HelloClient;", "", "hello", "Lio/reactivex/Single;", "", "name", "micronaut-hello-world-kt"})
@io.micronaut.http.client.annotation.Client(value = "/")
public abstract interface HelloClient {
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get(value = "/hello/{name}")
    public abstract io.reactivex.Single<java.lang.String> hello(@org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.NotBlank()
    java.lang.String name);
}