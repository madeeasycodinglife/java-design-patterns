package com.madeeasy;

import com.madeeasy.animal.impl.TurnOffCommand;
import com.madeeasy.animal.impl.TurnOnCommand;

public class Main {
    public static void main(String[] args) {
        // Create a TV
        TV tv = new TV();

        // Create commands
        Command turnOnCommand = new TurnOnCommand(tv);
        Command turnOffCommand = new TurnOffCommand(tv);

        // Create a remote control
        RemoteControl remoteControl = new RemoteControl();

        // Set commands to the remote control buttons
        remoteControl.setCommand(turnOnCommand); // Assign turn on command to remote control
        remoteControl.pressButton(); // Press the remote control button to turn on the TV

        remoteControl.setCommand(turnOffCommand); // Assign turn off command to remote control
        remoteControl.pressButton(); // Press the remote control button to turn off the TV

    }
}