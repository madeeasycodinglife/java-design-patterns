package com.madeeasy.impl;


import com.madeeasy.Command;
import com.madeeasy.TV;

// Concrete command: TurnOffCommand
public class TurnOffCommand implements Command {
    private TV tv;

    public TurnOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOff();
    }
}
