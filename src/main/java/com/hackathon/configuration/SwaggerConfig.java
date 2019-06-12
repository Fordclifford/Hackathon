package com.hackathon.configuration;

import java.util.ArrayList;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import static springfox.documentation.builders.PathSelectors.regex;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelReference;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
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
                       ParameterBuilder aParameterBuilder = new ParameterBuilder();
        aParameterBuilder.name("Authorization")                 // name of header
                         .modelRef((ModelReference) new ModelRef("string"))
                         .parameterType("header")               // type - header
                         .defaultValue("Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiIxIiwiaWF0IjoxNTYwMzMxNTg1LCJleHAiOjE1NjA5MzYzODV9.jFk7O6ron1ed5ZSqSZd2FArHU2x3gRsQOfwaQA53sl8kBhFiyIBZCecG3nJ1DzQxwkIbHZXEAO_hGfbQCKqq0g")        // based64 of - zone:mypassword
                         .required(true)                // for compulsory
                         .build();
        java.util.List<Parameter> aParameters = new ArrayList<>();
        aParameters.add(aParameterBuilder.build());             // add parameter
        return new Docket(DocumentationType.SWAGGER_2).select()
                                                      .apis(RequestHandlerSelectors
                                                              .any())
                 .apis(RequestHandlerSelectors.basePackage("com.hackathon"))
                                                      .paths(PathSelectors.any())
                                                      .build().
                                                              pathMapping("/api.*")
                                                      .globalOperationParameters(aParameters);
               
             
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
