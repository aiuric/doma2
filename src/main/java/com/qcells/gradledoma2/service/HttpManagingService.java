package com.qcells.gradledoma2.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class HttpManagingService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public void printMessage (String[] arguments) {

        logger.debug("test");

        // null check
        //String nullTest = "is not null!";
        //Optional<String> opt = Optional.ofNullable(nullTest); // Optional
        //opt.ifPresent(arg -> System.out.println(arg)); // null-safe
    }
}
