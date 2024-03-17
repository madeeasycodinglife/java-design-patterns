package com.madeeasy.state.impl;

import com.madeeasy.TrafficLight;
import com.madeeasy.TrafficLightState;

public class YellowState  implements TrafficLightState {
    @Override
    public void change(TrafficLight trafficLight) {
        System.out.println("Traffic light is yellow. Wait!");
        // Change state to red
        trafficLight.setState(new RedState());
    }
}
