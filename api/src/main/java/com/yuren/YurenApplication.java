package com.yuren;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class YurenApplication {

    public static void main(String[] args) {
        SpringApplication.run(YurenApplication.class, args);
    }

}
