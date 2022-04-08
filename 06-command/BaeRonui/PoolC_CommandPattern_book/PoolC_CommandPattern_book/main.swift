//
//  main.swift
//  PoolC_CommandPattern_book
//
//  Created by 유태호 on 2022/04/07.
//

import Foundation

var remoteControl = RemoteControl()

var livingRoomLight = Light(location: "Living Room")
var kitchenLight = Light(location: "Kitchen")
var ceilingFan = CeilingFan(location: "Living Room")
var garageDoor = GarageDoor(location: "")
var stereo = Stereo(location: "Living Room")

var livingRoomLightOn = LightOnCommand(light: livingRoomLight)
var livingRoomLightOff = LightOffCommand(light: livingRoomLight)
var kitchenLightOn = LightOnCommand(light: kitchenLight)
var kitchenLightOff = LightOffCommand(light: kitchenLight)

var ceilingFanOn = CeilingFanOnCommand(ceilingFan: ceilingFan)
var ceilingFanOff = CeilingFanOffCommand(ceilingFan: ceilingFan)

var garageDoorUpCoomand = GarageDoorUpCommand(garageDoor: garageDoor)
var garageDoorDownCommand = GarageDoorDownCommand(garageDoor: garageDoor)

var stereoOnWithCD = StereoOnWithCDCommand(stereo: stereo)
var stereoOff = StereoOffWithCDCommand(stereo: stereo)

remoteControl.setCommand(slot: 0, onCommand: livingRoomLightOn, offCommand: livingRoomLightOff)
remoteControl.setCommand(slot: 1, onCommand: kitchenLightOn, offCommand: kitchenLightOff)
remoteControl.setCommand(slot: 2, onCommand: ceilingFanOn, offCommand: ceilingFanOff)
remoteControl.setCommand(slot: 3, onCommand: stereoOnWithCD, offCommand: stereoOff)

print(remoteControl.toString())

remoteControl.onButtonWasPushed(slot: 0)
remoteControl.offButtonWasPushed(slot: 0)
remoteControl.onButtonWasPushed(slot: 1)
remoteControl.offButtonWasPushed(slot: 1)
remoteControl.onButtonWasPushed(slot: 2)
remoteControl.offButtonWasPushed(slot: 2)
remoteControl.onButtonWasPushed(slot: 3)
remoteControl.offButtonWasPushed(slot: 3)
remoteControl.onButtonWasPushed(slot: 4)
remoteControl.offButtonWasPushed(slot: 4)
remoteControl.onButtonWasPushed(slot: 5)
remoteControl.offButtonWasPushed(slot: 5)
