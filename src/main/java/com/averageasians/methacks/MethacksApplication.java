package com.averageasians.methacks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class MethacksApplication {

	public static void main(String[] args) {
		SpringApplication.run(MethacksApplication.class, args);
	}

}
