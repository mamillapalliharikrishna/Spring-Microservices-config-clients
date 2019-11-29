package com.calldetails.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope
public class CalldetailsMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalldetailsMicroserviceApplication.class, args);
	}

}
