package com.maven.ssm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import com.google.common.collect.Sets;
/**
 * @Project: vnews
 * @Class: SwaggerConfig.java
 * @Description: swagger配置
 * @Date: 2018年3月31日
 * @author liuwei5
 */

@Configuration
@EnableWebMvc
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.produces(Sets.newHashSet("application/json"))
				.consumes(Sets.newHashSet("application/json"))
				.protocols(Sets.newHashSet("http", "https"))
				.forCodeGeneration(true).apiInfo(apiInfo()).select()
				.apis(RequestHandlerSelectors.basePackage("com.maven.ssm"))// 扫描com路径下的api文档
				.paths(PathSelectors.any())// 路径判断
				.build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("XIUYUAN NEWS API")// 标题
				.description("XIUYUAN NEWS API")// 描述
				.contact(new Contact("xiuyuan", "https://github.com/lw93", "842363736@qq.com"))// 作者信息
				.version("1.0.0")// 版本号
				.build();
	}
}
