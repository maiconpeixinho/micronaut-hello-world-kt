package com.maiconpeixinho

import io.micronaut.runtime.Micronaut.build

fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("com.maiconpeixinho")
		.start()
}

