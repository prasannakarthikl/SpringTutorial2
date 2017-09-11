package com.example.pagespeedv2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class PageSpeedv2Application {

	public static void main(String[] args) {
		SpringApplication.run(PageSpeedv2Application.class, args);
	}
}
