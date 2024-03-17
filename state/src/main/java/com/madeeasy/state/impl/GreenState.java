package com.madeeasy.state.impl;

import com.madeeasy.TrafficLight;
import com.madeeasy.TrafficLightState;

public class GreenState implements TrafficLightState {
    @Override
    public void change(TrafficLight trafficLight) {
        System.out.println("Traffic light is green. Go!");
        // Change state to yellow
        trafficLight.setState(new YellowState());
    }
}
