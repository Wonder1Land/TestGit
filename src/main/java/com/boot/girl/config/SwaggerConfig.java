package com.boot.girl.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {@Bean
public Docket createRestApi() {
    return new Docket(DocumentationType.SWAGGER_2)
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.boot.girl"))
                    .paths(PathSelectors.any())
                    .build()
                    .apiInfo(apiInfo());
}

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("测试接口平台API")
                .description("swagger2 尝试配置")
                        .termsOfServiceUrl("Terms of service")
                        .contact("myeaddress@company.com")
                        .version("1.0")
                        .build();
    }

}
