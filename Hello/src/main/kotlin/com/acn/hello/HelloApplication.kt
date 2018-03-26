package com.acn.hello

import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class HelloApplication {
    private val log = LoggerFactory.getLogger(HelloApplication::class.java)

    @Bean
    fun init() = CommandLineRunner {
        log.info("Hello Spring boot")
    }
}

fun main(args: Array<String>) {
    runApplication<HelloApplication>(*args)
}
