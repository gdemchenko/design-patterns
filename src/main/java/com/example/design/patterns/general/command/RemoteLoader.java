package com.example.design.patterns.general.command;

import com.example.design.patterns.general.command.command.impl.*;
import com.example.design.patterns.general.command.invoker.RemoteControlWithUndo;
import com.example.design.patterns.general.command.receiver.CeilingFan;
import com.example.design.patterns.general.command.receiver.GarageDoor;
import com.example.design.patterns.general.command.receiver.Light;
import com.example.design.patterns.general.command.receiver.Stereo;

public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControlWithUndo rc = new RemoteControlWithUndo();

        Light livingRoomLight = new Light("Living room");
        Light kitchenLight = new Light("Kitchen room");
        CeilingFan livingRoomCeilingFan = new CeilingFan("Living room");
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo("Living room");

        LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOnCommand = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOffCommand = new LightOffCommand(kitchenLight);
        CeilingFanHighCommand livingRoomCeilingFanOnCommand = new CeilingFanHighCommand(livingRoomCeilingFan);
        CeilingFanOffCommand livingRoomCeilingFanOffCommand = new CeilingFanOffCommand(livingRoomCeilingFan);
        GarageDoorUpCommand garageDoorUpCommand = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDownCommand = new GarageDoorDownCommand(garageDoor);
        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        rc.setCommand(0, livingRoomLightOnCommand, livingRoomLightOffCommand);
        rc.setCommand(1, kitchenLightOnCommand, kitchenLightOffCommand);
        rc.setCommand(2, livingRoomCeilingFanOnCommand, livingRoomCeilingFanOffCommand);
        rc.setCommand(3, stereoOnWithCDCommand, stereoOffCommand);

        rc.onButonPushed(0);
        rc.offButonPushed(0);
        rc.undoButtonPushed();
        rc.offButonPushed(0);
        rc.onButonPushed(0);
        rc.undoButtonPushed();
    }

}
