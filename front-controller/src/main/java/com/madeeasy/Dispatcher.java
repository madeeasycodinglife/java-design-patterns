package com.madeeasy;

// Dispatcher
public class Dispatcher {

    private HomeController homeController;
    private AboutController aboutController;

    public Dispatcher() {
        homeController = new HomeController();
        aboutController = new AboutController();
    }

    public void dispatch(String request) {
        if (request.equalsIgnoreCase("home")) {
            homeController.show();
        } else if (request.equalsIgnoreCase("about")) {
            aboutController.show();
        } else {
            System.out.println("Invalid request!");
        }
    }
}
