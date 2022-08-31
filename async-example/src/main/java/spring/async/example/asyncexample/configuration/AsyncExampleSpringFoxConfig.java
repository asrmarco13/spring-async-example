package spring.async.example.asyncexample.configuration;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * *The class AsyncExampleSpringFoxConfig
 * *Author: Marco Orfei
 */
@Configuration
public class AsyncExampleSpringFoxConfig {

    @Bean
    Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("spring.async.example.asyncexample.controller"))
                .paths(PathSelectors.any())
                .build().useDefaultResponseMessages(false).apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfo("Spring Async Example", "Example of spring async app", "1.0", "Terms of Service",
                new Contact("Marco Orfei", "url", "marcoasrorfei@gmail.com"), "GPL-3.0",
                "https://github.com/asrmarco13/spring-async-example/blob/main/LICENSE", Collections.emptyList());
    }

}
