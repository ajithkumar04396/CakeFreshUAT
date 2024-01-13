package com.cakefresh.dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.Banner;

@SpringBootApplication
//@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class DevApplication {
	public static void main(String[] args) {
//		SpringApplication.run(DevApplication.class, args);
		SpringApplication application = new SpringApplication(DevApplication.class);
		application.setBannerMode(Banner.Mode.OFF);
		application.run(args);
	}
}


