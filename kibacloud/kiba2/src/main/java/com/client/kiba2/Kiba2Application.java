package com.client.kiba2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Kiba2Application {

    public static void main(String[] args) {
        SpringApplication.run(Kiba2Application.class, args);
    }

}
