package com.dev.first_spring_app.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloConfig {
    
    @Bean
    public String helloWorld() {
        return "Hello World";
    }

}
