package com.anuja;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Hello world!
 *
 */
@EnableJpaRepositories(basePackages = "com.anuja.repository")
@SpringBootApplication
@ComponentScan({ "com.anuja1.dependent_app.test" })
public class App {

//	@Autowired
//	DependentApp dependentApp;

	public static void main(String[] args) {
		ConfigurableApplicationContext appcontext = SpringApplication.run(App.class, args);

//		appcontext.getBean(Test.class);
////		appcontext.getBean(Test.class);
		System.out.println("Hello World!");
	}
}
