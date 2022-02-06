package com.sandboxworms.doby;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.core.net.SyslogOutputStream;

@SpringBootApplication
public class DobyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DobyApplication.class, args);
		
		System.out.println("Worm Doby Welcomes you");
	}

}
