
package com.kiet.student;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StudentApplication {

    private static final Logger logger =
            LoggerFactory.getLogger(StudentApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(StudentApplication.class, args);
    }

    @Bean
    CommandLineRunner runner() {
        return args -> {
            logger.info("KIET Student Management System Started");
            logger.info("Loading Student Data...");
            logger.info("Student Management REST API is Ready");
        };
    }
}
