package com.basic.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class BasicApplication {

    private static final Logger LOG = LoggerFactory.getLogger(BasicApplication.class);

    public static void main( final String[] args ) throws Exception
    {
        LOG.debug("Booting Spring Application ...... ");
        SpringApplication.run(BasicApplication.class, args);

    }

}
