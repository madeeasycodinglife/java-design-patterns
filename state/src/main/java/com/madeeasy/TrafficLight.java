package com.madeeasy;

import com.madeeasy.state.impl.RedState;

// Context class
public class TrafficLight {
    private TrafficLightState state;

    public TrafficLight() {
        // Initially, set the state to red
        state = new RedState();
    }

    public void setState(TrafficLightState state) {
        this.state = state;
    }

    public void change() {
        state.change(this);
    }
}