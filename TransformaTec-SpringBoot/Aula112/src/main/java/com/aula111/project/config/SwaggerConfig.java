package com.aula111.project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {
    
    @Bean
    public Docket api(){

        return new Docket(DocumentationType.SWAGGER_2)
                    .select()
                    .apis(RequestHandlerSelectors.basePackage("com.aula111.project"))
                    .build()
                    .apiInfo(info());

    }

    private ApiInfo info() {
        return new ApiInfoBuilder()
                    .title("API de Tutoriais e Comentários")
                    .description("API para manutenção de registros de tutoriais e comentários")
                    .version("1.0.0")
                    .license("Apache License Version 2.0")
                    .contact(new Contact("Cassiano", "cassiano.dev", "cassiano@dev.com"))
                    .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0")
                    .build();
    }

}

