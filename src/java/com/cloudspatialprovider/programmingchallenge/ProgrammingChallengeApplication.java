package com.cloudspatialprovider.programmingchallenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ProgrammingChallengeApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProgrammingChallengeApplication.class, args);
    }
}
