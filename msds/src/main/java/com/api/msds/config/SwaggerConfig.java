package com.api.msds.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;

@Configuration
@OpenAPIDefinition
public class SwaggerConfig {
	private static final String SECURITY_SCHEME_NAME = "authorization";	// 추가
	
	@Bean
    // localhost:xxxx/swagger-ui/index.html#/  << 접속경로
    public OpenAPI baseOpenAPI() {
        return new OpenAPI()
        		.components(new Components()
        	    .addSecuritySchemes(SECURITY_SCHEME_NAME, new SecurityScheme()
                           .name(SECURITY_SCHEME_NAME)
                           .type(SecurityScheme.Type.HTTP)
                           .scheme("bearer")
                           .bearerFormat("JWT")))
           		.addSecurityItem(new SecurityRequirement().addList(SECURITY_SCHEME_NAME))
        		.info(new Info()
        				.title("API MSDS")
        				.version("1.0")
        				.description("MSDS API"));
    }
}
