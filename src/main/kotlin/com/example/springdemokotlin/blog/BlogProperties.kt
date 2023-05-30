package com.example.springdemokotlin.blog

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConfigurationProperties("blog")
@ConstructorBinding
data class BlogProperties(val title: String, val banner: Banner) {
    data class Banner(val title: String? = null, val content: String)
}
