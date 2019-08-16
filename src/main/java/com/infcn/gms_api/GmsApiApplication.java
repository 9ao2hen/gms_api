package com.infcn.gms_api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@Slf4j
public class GmsApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmsApiApplication.class, args);
    }

}
