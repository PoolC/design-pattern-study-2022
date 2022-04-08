//
//  main.swift
//  PoolC_CommandPattern_book
//
//  Created by 유태호 on 2022/04/07.
//

import Foundation

var remoteControl = RemoteControl()

var livingRoomLight = Light(location: "Living Room")

var livingRoomLightOn = LightOnCommand(light: livingRoomLight)
var livingRoomLightOff = LightOffCommand(light: livingRoomLight)

remoteControl.setCommand(slot: 0, onCommand: livingRoomLightOn, offCommand: livingRoomLightOff)

print(remoteControl.toString())

remoteControl.onButtonWasPushed(slot: 0)
remoteControl.offButtonWasPushed(slot: 0)

print(remoteControl)

remoteControl.undoButtonWasPushed()
remoteControl.offButtonWasPushed(slot: 0)
remoteControl.onButtonWasPushed(slot: 0)

print(remoteControl)

remoteControl.undoButtonWasPushed()
