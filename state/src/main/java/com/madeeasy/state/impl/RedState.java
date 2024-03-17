package com.madeeasy.state.impl;

import com.madeeasy.TrafficLight;
import com.madeeasy.TrafficLightState;

// Concrete state: RedState
public class RedState implements TrafficLightState {
    @Override
    public void change(TrafficLight trafficLight) {
        System.out.println("Traffic light is red. Stop!");
        // Change state to green
        trafficLight.setState(new GreenState());
    }
}
