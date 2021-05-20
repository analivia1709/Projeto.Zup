package com.zup.ZupProjeto.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
	public Docket Api() {
		return new Docket(DocumentationType.SWAGGER_2)
		.select()
		.apis(RequestHandlerSelectors.basePackage("com.zup.ZupProjeto"))
		.paths(PathSelectors.regex("/usuario.*"))	
		.build()
		.apiInfo(metaInfo());
		
	}
	
	private ApiInfo metaInfo() {
		ApiInfo apiInfo = new ApiInfo(
				"Zup Projetos ",
				"Api Rest do cadastro de usuario e endereço ",
				"1.0",
				"Terms of service ",
				new Contact ("Ana Livia", "tresliviaana@gmail.com", null),
				"Apache License Version 2.0",
				"http://www.apache.org/licesen.html", new ArrayList <VendorExtension>()
	
				
				);
		return apiInfo;
				
		
	}
}