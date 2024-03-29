package com.spring.servicelocatorfactorybean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServicelocatorfactorybeanApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicelocatorfactorybeanApplication.class, args);
	}
	
	@Bean
	public FactoryBean<?> exampleFactory() {
		ServiceLocatorFactoryBean factoryBean = new ServiceLocatorFactoryBean();
		factoryBean.setServiceLocatorInterface(MobileFactory.class);
		return factoryBean;
	}

}
