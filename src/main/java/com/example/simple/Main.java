package com.example.simple;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger log = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        System.out.println("Hello " + getLoggerClassName());
        log.info("Hello");
    }

    public static String getLoggerClassName() {
        return log.getClass().getName();
    }

    public static void anUnimplementedMethod() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
