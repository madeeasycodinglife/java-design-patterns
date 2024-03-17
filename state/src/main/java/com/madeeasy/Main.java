package com.madeeasy;

public class Main {
    public static void main(String[] args) {
        // Create a traffic light
        TrafficLight trafficLight = new TrafficLight();

        // Simulate traffic light changes
        trafficLight.change(); // Red
        trafficLight.change(); // Green
        trafficLight.change(); // Yellow
        trafficLight.change(); // Red
    }
}