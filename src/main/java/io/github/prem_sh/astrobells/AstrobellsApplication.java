package io.github.prem_sh.astrobells;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:swagger.properties")
public class AstrobellsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AstrobellsApplication.class, args);
	}

}
