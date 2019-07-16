package com.zj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//@MapperScan("com.zj.dao")
@EnableScheduling
public class APP {

	public static void main(String[] args) {
		
		SpringApplication.run(APP.class, args);
		System.out.println("APP start success!");
	}

}
