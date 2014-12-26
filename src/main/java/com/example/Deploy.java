package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Deploy implements CommandLineRunner {
    private static final Logger LOGGER = LoggerFactory.getLogger(Deploy.class);

    @Autowired
    private DeployConfig config;

    @Autowired
    private DeployService deployService;

    /**
     * mvn clean package spring-boot:repackage
     * java -jar target/spring-boot-example-1.0.0-SNAPSHOT.jar --spring.profiles.active=qa --version=1.0
     *
     * @param strings arguments
     * @throws Exception
     */

    @Override
    public void run(String... strings) throws Exception {
        try {
            deployService.deploy(config);
        } catch (Exception ve) {
            LOGGER.error("Error : {}", ve.getMessage());
        }

        LOGGER.info("Created stack={}", config.getVersion());
    }

    public static void main(String... args) {
        LOGGER.info("Starting to run...");
        SpringApplication.run(Deploy.class, args);
        LOGGER.info("Completed the run...");
    }
}
