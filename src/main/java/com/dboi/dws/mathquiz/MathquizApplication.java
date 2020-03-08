package com.dboi.dws.mathquiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@EnableJpaAuditing
public class MathquizApplication {


	public static void main(String[] args) {
		SpringApplication.run(MathquizApplication.class, args);
	}

}
