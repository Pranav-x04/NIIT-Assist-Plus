package com.eventrave.niranjanee.config;

import static com.eventrave.niranjanee.utils.MyConstant.*;
import static io.swagger.v3.oas.models.security.SecurityScheme.Type.HTTP;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
public class SwaggerApiConfig {

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .servers(List.of(new Server().url(JWT_LOCALHOST_URL)))
                .addSecurityItem(new SecurityRequirement()
                        .addList(JWT_SECURITY_SCHEME_NAME))
                .components(new Components()
                        .addSecuritySchemes(
                                JWT_SECURITY_SCHEME_NAME, new SecurityScheme()
                                        .name(JWT_SECURITY_SCHEME_NAME)
                                        .type(HTTP)
                                        .scheme(JWT_SCHEME)
                                        .description(JWT_DESCRIPTION)
                                        .bearerFormat(JWT_BEARER_FORMAT)));
    }
}
