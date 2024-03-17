package com.madeeasy.impl;

import com.madeeasy.Filter;

// Concrete filter: AuthenticationFilter
public class AuthenticationFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("Authentication filter processing request: " + request);
    }
}