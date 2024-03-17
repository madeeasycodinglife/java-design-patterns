package com.madeeasy.animal.impl;

import com.madeeasy.Command;
import com.madeeasy.TV;

// Concrete command: TurnOnCommand
public class TurnOnCommand implements Command {
    private TV tv;

    public TurnOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOn();
    }
}
