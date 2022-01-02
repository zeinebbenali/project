package com.boot.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@Slf4j
public class MarketStockApiApplication {

    public static void main(String[] args) {
        log.info("Start APPLICATION");
        SpringApplication.run(MarketStockApiApplication.class, args);

    }

}
