package com.example.saleserivce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SaleSerivceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SaleSerivceApplication.class, args);
    }

}
