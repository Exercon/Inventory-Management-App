package com.company.invmngapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;
//import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication//(exclude={MultipartAutoConfiguration.class}) //(exclude = {ErrorMvcAutoConfiguration.class})
@EnableCaching
@EnableTransactionManagement
public class InvmngApiApplication extends SpringBootServletInitializer {

	/**
	 * Extending SpringBootServletInitializer help us
	 * to deploy this apps war file to tomcat outside of production.
	 *
	 * @author Ant Kaynak github/Exercon
	 * */

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(InvmngApiApplication.class);
	}


	public static void main(String[] args) {
		SpringApplication.run(InvmngApiApplication.class, args);
	}

}