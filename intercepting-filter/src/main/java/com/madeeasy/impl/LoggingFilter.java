package com.madeeasy.impl;

import com.madeeasy.Filter;

// Concrete filter: LoggingFilter
public class LoggingFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("Logging filter processing request: " + request);
    }
}
