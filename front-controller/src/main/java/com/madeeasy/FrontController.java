package com.madeeasy;

// Front Controller
public class FrontController {
    private Dispatcher dispatcher;

    public FrontController() {
        dispatcher = new Dispatcher();
    }

    public void handleRequest(String request) {
        // Log the request
        System.out.println("Request received: " + request);

        // Route the request through the dispatcher
        dispatcher.dispatch(request);
    }
}
