package com.sxdx.basic.config;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * ClassName:Swagger2 <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2020年1月18日 下午6:22:51 <br/>
 *
 * @author lijinzhao
 * @version 1.0
 * @see
 * @since JDK 1.8
 */
@Configuration
@EnableSwagger2
public class Swagger2 {

    /**
     * @name: createRestApi
     * @description: TODO  项目全部的Api
     * @return: springfox.documentation.spring.web.plugins.Docket
     * @date: 2020/2/7 10:13
     * @auther: 李今朝
     */
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("毕设小组")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.sxdx"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("毕业设计-CRM客户关系管理信息系统")
                .description("大家一起加油！让我们顺利毕业！")
                .termsOfServiceUrl("http://www.sxdx.com")
                .version("v1.0")
                .contact(new Contact("跳转到crm登陆首页", "http://localhost:8080/index.html", null))
                .build();
    }

    /**
     * @name: ApiOfLiJinzhao
     * @description: TODO 配置李今朝的接口分组
     * @return: springfox.documentation.spring.web.plugins.Docket
     * @date: 2020/2/7 10:06
     * @auther: 李今朝
     */
    @Bean
    public Docket ApiOfLiJinzhao() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("李今朝")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.sxdx.personnel"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * @name: ApiOfXueYawen
     * @description: TODO  配置薛雅文的接口分组
     * @return: springfox.documentation.spring.web.plugins.Docket
     * @date: 2020/2/7 10:07
     * @auther: 李今朝
     */
    @Bean
    public Docket ApiOfXueYawen() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("薛雅文")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.sxdx.finance"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * @name: ApiOfLiKang
     * @description: TODO  配置李康的接口分组
     * @return: springfox.documentation.spring.web.plugins.Docket
     * @date: 2020/2/7 10:09
     * @auther: 李今朝
     */
    @Bean
    public Docket ApiOfLiKang() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("李康")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.sxdx.announcementInformation" + splitor + "com.sxdx.productInformation"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * @name: ApiOfZhangWei
     * @description: TODO  配置张伟的接口分组
     * @return: springfox.documentation.spring.web.plugins.Docket
     * @date: 2020/2/7 10:10
     * @auther: 李今朝
     */
    @Bean
    public Docket ApiOfZhangWei() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("张伟")
                .select()
                .apis(basePackage("com.sxdx.orderAndConstract" + splitor + "com.sxdx.system"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * @name: ApiOfBiBicheng
     * @description: TODO  配置毕必成的接口分组
     * @return: springfox.documentation.spring.web.plugins.Docket
     * @date: 2020/2/7 10:11
     * @auther: 李今朝
     */
    @Bean
    public Docket ApiOfBiBicheng() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("毕必成")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.sxdx.customer"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * @description: TODO  以下方法为重写方法，用来支持swagger2来扫描多个包
     * @param null
     * @return:
     * @date: 2020/2/16 15:24
     * @auther: 李今朝
     */
    private static final String splitor = ";";

    private static Function<Class<?>, Boolean> handlerPackage(final String basePackage) {
        return input -> {
            for (String strPackage : basePackage.split(splitor)) {
                if (input.getPackage().getName().startsWith(strPackage)) {
                    return true;
                }
            }
            return false;
        };
    }

    public static Predicate<RequestHandler> basePackage(final String basePackage) {
        return input -> declaringClass(input).transform(handlerPackage(basePackage)).or(true);
    }

    private static Optional<? extends Class<?>> declaringClass(RequestHandler input) {
        return Optional.fromNullable(input.declaringClass());
    }

}

