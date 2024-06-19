package com.client.ws.rasmooplus.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI apiInfo(){
        return new OpenAPI()
                .info(new Info()
                        .title("Rasmoo Plus")
                        .description("Api para atender o client Rasmoo Plus")
                        .version("0.0.1")
                        .license(new License()
                                .name("Rasmoo cursos de tecnologia"))
                );

    }

}


//@Configuration
//@EnableWebMvc
////@EnableSwagger2
//public class SwaggerConfig {
//
//    @Bean
//    public Docket api(){
//        return new Docket(DocumentationType.SWAGGER_2).useDefaultResponseMessages(false).groupName("v0").select()
//                .apis(RequestHandlerSelectors.basePackage("com.client.ws.rasmooplus.controller"))
//                .paths(PathSelectors.any()).build().apiInfo(apiInfo());
//    }
//
//    private ApiInfo apiInfo() {
//        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();
//
//        return apiInfoBuilder
//                .title("Rasmoo Plus")
//                .description("Api para atender o client Rasmoo Plus")
//                .version("0.0.1")
//                .license("Rasmoo cursos de tecnologia")
//                .build();
//    }
//}
