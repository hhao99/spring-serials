package com.acn

import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class Application {
    private val log = LoggerFactory.getLogger(Application::class.java)

    @Bean
    fun init() = CommandLineRunner {
        log.info("spring boot data application")
    }
}

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
