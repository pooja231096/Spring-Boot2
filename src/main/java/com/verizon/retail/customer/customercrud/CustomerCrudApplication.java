package com.verizon.retail.customer.customercrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.audit.AuditAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication (exclude= {AuditAutoConfiguration.class})
@PropertySource("classpath:application-${spring.profiles.active}.properties")
@Import(Swaggerconfig.class)
@EnableSwagger2
public class CustomerCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerCrudApplication.class, args);
	}

}
