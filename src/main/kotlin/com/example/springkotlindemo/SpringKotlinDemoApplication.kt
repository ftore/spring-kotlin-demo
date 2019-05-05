package com.example.springkotlindemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(basePackages = arrayOf("com.example.springkotlindemo.*"))
@EntityScan("com.example.springkotlindemo.*")
class SpringKotlinDemoApplication

fun main(args: Array<String>) {
    runApplication<SpringKotlinDemoApplication>(*args)
}
