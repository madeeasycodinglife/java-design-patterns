package com.madeeasy;

import com.madeeasy.impl.AuthenticationFilter;
import com.madeeasy.impl.LoggingFilter;

// Client code
public class Main {
    public static void main(String[] args) {
        // Create filter manager with target
        Target target = new Target();
        FilterManager filterManager = new FilterManager(target);

        // Add filters to the filter manager
        filterManager.addFilter(new AuthenticationFilter());
        filterManager.addFilter(new LoggingFilter());

        // Filter and process request
        filterManager.filterRequest("GET /homepage");
    }
}