package com.fate.test.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @ClassName: swagger2配置
 * @Description: TODO
 * @author 刘圈圈
 * @date 2018年7月5日
 */

@Configuration
@EnableSwagger2
public class SwiggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.fate.test"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //.title("元素领主(连接 大源(玛那)) 的神圣API")
                .title("FGO测试")
                .description("Buster! Arts! Quick!")
                //.contact("此世无存的虚空之王")
                .contact("TBS")
                .version("0.1")
                .build();
    }

}