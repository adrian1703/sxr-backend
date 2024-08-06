package com.adrian.sxr

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SxrApplication

fun main(args: Array<String>) {
	runApplication<SxrApplication>(*args)
}
