package net.javaguides.springboot.config;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Spring Boot Rest API Documentation",
                description = "Documentation for Spring Boot Rest APIs",
                version = "v1.0",
                contact = @Contact(
                        name = "C V Rajasekhar",
                        email = "cvrajasekhar100@gmail.com",
                        url = "http://www.example.com/rajasekhar"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "http://www.example.com/license"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description = "Spring Boot User Management Documentation",
                url = "http://www.example.com/user_management.html"
        )
)
//@EnableAsync // Enable asynchronous processing for improved performance
//@EnableWebMvc // Enable Spring MVC features for better web application support
public class AppConfig {

}
