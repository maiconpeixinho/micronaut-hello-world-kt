package com.maiconpeixinho

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("com.maiconpeixinho")
		.start()
}

