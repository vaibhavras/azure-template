package com.azure.azuretemplate.restcontroller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class Sample {

    @Autowired
    private Environment env;

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public String hello() {
        logger.info("From hello().");
        logger.info("print java home {}", env.getProperty("JAVA_HOME"));
        return "Hello from Azure template poc";
    }

    @GetMapping("/welcome")
    @ResponseStatus(HttpStatus.OK)
    public String welcome() {
        logger.info("From welcome()");
        return "Welcome to azure template poc";
    }

}
