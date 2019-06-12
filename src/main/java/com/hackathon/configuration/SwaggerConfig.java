package com.hackathon.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import static springfox.documentation.builders.PathSelectors.regex;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 *
 * @author techsavanna
 */
@EnableSwagger2
@Configuration
public class SwaggerConfig {
     @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.hackathon"))
                .paths(regex("/api.*"))
                .build()
                .apiInfo(metaInfo());
    }

    private ApiInfo metaInfo() {

        ApiInfo apiInfo = new ApiInfo(
                "Spring Boot Backend Interview Question API",
                "This is the documentation of all the APIs have been developed in this project",
                "1.0",
                "Terms of Service",
                new Contact("Clifford", "https://github.com/FordClifford","cliffordmasi07@gmail.com").toString(),
                "License Version 2.0",
                "https:/github.com/FordClifford.html"
        );

        return apiInfo;
    }
}
