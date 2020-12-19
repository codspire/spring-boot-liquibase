package com.codspire.db.mgmt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class LiquibaseApplication implements CommandLineRunner {

    private static final Logger LOG = LoggerFactory.getLogger(LiquibaseApplication.class);

    public static void main(String[] args) {
        LOG.info("STARTING THE APPLICATION");

        SpringApplication.run(LiquibaseApplication.class, args);

        LOG.info("APPLICATION FINISHED");
    }

    @Override
    public void run(String... args) {
        LOG.info("EXECUTING : command line runner");
        LOG.info("{}", Arrays.asList(args));
    }
}