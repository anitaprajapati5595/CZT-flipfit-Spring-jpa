package com.czt.flipfit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableJpaRepositories("com.czt.repository")
@EntityScan("com.czt.entity")
@SpringBootApplication
@EnableWebMvc
@ComponentScan("com.czt.*")
@EnableAutoConfiguration
public class CztFlipFitSpringRestJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CztFlipFitSpringRestJpaApplication.class, args);
	}

}
