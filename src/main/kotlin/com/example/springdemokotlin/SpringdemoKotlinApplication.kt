package com.example.springdemokotlin

import com.example.springdemokotlin.blog.BlogProperties
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(BlogProperties::class)
class SpringdemoKotlinApplication
fun main(args: Array<String>) {
    runApplication<SpringdemoKotlinApplication>(*args)
}
