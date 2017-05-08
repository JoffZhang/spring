package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Hello world!
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ComputeServiceApplication {
    public static void main(String[] args) {
        //new SpringApplicationBuilder(ComputeServiceApplication.class).web(true).run(args);
        SpringApplication.run(ComputeServiceApplication.class,args);
    }
}
