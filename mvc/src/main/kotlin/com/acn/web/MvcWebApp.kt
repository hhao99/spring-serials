package com.acn.web

import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@SpringBootApplication
class MvcWebApp {
    private val log = LoggerFactory.getLogger(MvcWebApp::class.java)

    @Bean
    fun init() = CommandLineRunner {
        log.info("Hello Spring boot")
    }
}

fun main(args: Array<String>) {
    runApplication<MvcWebApp>(*args)
}

@Controller
class HomeController{
    @RequestMapping("/")
    fun index() = "index"
}